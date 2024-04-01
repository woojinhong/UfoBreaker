package ch.games.snake.model

import scalafx.scene.image.ImageView

class Brick(val imageView: ImageView) extends GameObject {
  override def move(deltaX: Double, deltaY: Double): Unit = {}

  override def update(): Unit = {}

  override def collidesWith(other: ImageView): Boolean =
    imageView.getBoundsInParent.intersects(other.getBoundsInParent)
}