package ch.games.snake.model

import scalafx.scene.image.ImageView

trait GameObject {
  val imageView: ImageView
  def move(deltaX: Double, deltaY: Double): Unit
  def update(): Unit
  def collidesWith(other: ImageView): Boolean
}