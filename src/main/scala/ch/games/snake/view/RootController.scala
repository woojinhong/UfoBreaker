package ch.games.snake.view

import scalafx.application.Platform
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control.ButtonType
import scalafxml.core.macros.sfxml

@sfxml
class RootController() {

  def newHelp(): Unit = {
    val alert = new Alert(AlertType.Information) {
      title = "About"
      headerText = "ufo breaker"
      contentText = "Welcome to the UFO Breaker game. To play, use the left and right arrow keys to aim the bomb and destroy the UFOs as accurately as possible. The game will be completed once you destroy the UFOs successfully. Have a great time playing!"
    }
    alert.showAndWait()
  }

  def closeApplication(): Unit = {
    val alert = new Alert(AlertType.Confirmation) {
      title = "Confirm Exit"
      headerText = "Are you sure you want to exit?"
      contentText = "Any unsaved progress will be lost."
    }
    val result = alert.showAndWait()
    if (result.contains(ButtonType.OK)) {
      Platform.exit()
    }
  }



}