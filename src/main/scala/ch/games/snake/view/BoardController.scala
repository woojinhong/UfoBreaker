package ch.games.snake.view

import scalafx.animation.AnimationTimer
import scalafx.scene.image.ImageView
import scalafx.scene.input.{KeyCode, KeyEvent}
import scalafx.scene.layout.AnchorPane
import scalafxml.core.macros.sfxml
import scalafx.collections.ObservableBuffer
import ch.games.snake.model._
import scalafx.application.Platform
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType

import scala.collection.convert.ImplicitConversions.`list asScalaBuffer`

@sfxml
class BoardController(
                       anchorPane: AnchorPane,
                       oval: ImageView,
                       ball: ImageView,
                       brick1: ImageView,
                       brick2: ImageView,
                       brick3: ImageView,
                       brick4: ImageView,
                       brick5: ImageView,
                       brick6: ImageView,
                       brick7: ImageView,
                       brick8: ImageView,
                       brick9: ImageView,
                       brick10: ImageView,
                       brick11: ImageView,
                       brick12: ImageView,
                       brick13: ImageView,
                       brick14: ImageView,
                       brick15: ImageView,

                     ) {
  var startTime: Long = 0 // Initialize the startTime when the game starts
  var elapsedTime: Double = 0
  private val boardWidth = 1200
  private val boardHeight = 687

  private val ballSpeed = 4

  oval.layoutY = 670

  var ballX = boardWidth / 2
  var ballY = boardHeight / 2
  var ballXDirection = 1
  var ballYDirection = 1

  private var gameStarted = false
  private var timer: AnimationTimer = _


  private val gameObjects: ObservableBuffer[GameObject] = ObservableBuffer(
    new Oval(oval),
    new Ball(ball),
    new Brick(brick1),
    new Brick(brick2),
    new Brick(brick3),
    new Brick(brick4),
    new Brick(brick5),
    new Brick(brick6),
    new Brick(brick7),
    new Brick(brick8),
    new Brick(brick9),
    new Brick(brick10),
    new Brick(brick11),
    new Brick(brick12),
    new Brick(brick13),
    new Brick(brick14),
    new Brick(brick15)
  )

  def handleKeyPressed(event: KeyEvent): Unit = {
    if (!gameStarted) {

      startGame()
      startTime = System.nanoTime()
    }

    if (event.code == KeyCode.Left) {
      gameObjects.collect { case obj: Oval => obj }.foreach(_.move(-10, 0))
    }
    if (event.code == KeyCode.Right) {
      gameObjects.collect { case obj: Oval => obj }.foreach(_.move(10, 0))
    }

    // Check if all bricks are destroyed
    if (gameObjects.collect { case obj: Brick => obj }.isEmpty) {
      printElapsedTime()
      resetGame()
    }


  }

  def startGame(): Unit = {
    if (timer != null) {
      timer.stop() // Stop the existing AnimationTimer if it's running
    }

    gameStarted = true



    // Start a new animation timer to move the ball
    timer = AnimationTimer { _ =>
      ballMove()
    }
    timer.start()
  }

  def ballMove(): Unit = {
    updateElapsedTime()
    ballX += ballSpeed * ballXDirection
    ballY += ballSpeed * ballYDirection

    if (ballX <= 0 || ballX >= boardWidth) {
      ballXDirection *= -1
    }

    if (ballY <= 0 || ballY >= boardHeight) {
      ballYDirection *= -1
    }

    ball.layoutX = ballX
    ball.layoutY = ballY

    // Check for collision with the oval
    if (ball.boundsInParent().intersects(oval.boundsInParent())) {
      ballYDirection *= -1
    }
    if (ballY >= boardHeight) {
      resetGame()
    }

    // Iterate through game objects and check for collision
    val bricksToRemove: List[Brick] = gameObjects.collect {
      case brick: Brick if ball.boundsInParent().intersects(brick.imageView.getBoundsInParent()) =>
        ballXDirection *= -1
        ballYDirection *= -1
        brick
    }.toList

    // Remove marked bricks from the buffer and the AnchorPane
    bricksToRemove.foreach(brick => {
      gameObjects -= brick
      anchorPane.children -= brick.imageView
    })


  }

  private def updateElapsedTime(): Unit = {
    val currentTime = System.nanoTime()
    elapsedTime = (currentTime - startTime) / 1e9
  }

  private def printElapsedTime(): Unit = {
    val secondsElapsed = elapsedTime.toInt
    println("Time elapsed: " + secondsElapsed + " seconds")
  }

  def resetGame(): Unit = {
    // Remove all bricks from gameObjects and their image views from anchorPane
    gameObjects.collect { case brick: Brick => brick.imageView }.foreach(anchorPane.children -= _)
    gameObjects --= gameObjects.collect { case brick: Brick => brick }

    // Reset ball and oval positions and directions
    ballX = boardWidth / 2
    ballY = boardHeight / 2
    ballXDirection = 1
    ballYDirection = 1
    oval.layoutX = boardWidth / 2

    // Stop the timer if it's running
    if (timer != null) {
      timer.stop()
    }

    // Reset gameStarted flag and start the timer on next key press
    gameStarted = false


    // Show a popup alert saying "You lose" using Platform.runLater

    Platform.runLater(() => {
      val alert = new Alert(AlertType.Information) {
        title = "Game Over"
        headerText = "You Lose"
        contentText = "Better luck next time!"
      }
      alert.showAndWait()
    })
    println("Resetting game...")
  }



}