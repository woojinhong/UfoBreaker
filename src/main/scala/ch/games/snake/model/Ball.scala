package ch.games.snake.model

import scalafx.scene.image.ImageView

class Ball(val imageView: ImageView) extends GameObject {
  override def move(deltaX: Double, deltaY: Double): Unit = {
    imageView.setLayoutX(imageView.getLayoutX + deltaX)
    imageView.setLayoutY(imageView.getLayoutY + deltaY)
  }

  override def update(): Unit = {}

  override def collidesWith(other: ImageView): Boolean =
    imageView.getBoundsInParent.intersects(other.getBoundsInParent)
}