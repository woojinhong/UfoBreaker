package ch.games.snake.view

import ch.games.snake.MainApp
import javafx.scene.media.{Media, MediaPlayer}
import scalafxml.core.macros.sfxml

import java.io.File

@sfxml
class WelcomeController(){

  private var backgroundMusicPlayer: MediaPlayer = _

  def getStarted(): Unit = {
    stopBackgroundMusic()
    MainApp.showBoard()
  }

  def playBackgroundMusic(): Unit = {
    // Absolute file path to the MP3 file
    val musicFile = new File("C:/Users/Hans/Downloads/addressappG7/addressappG7/src/main/resources/ch/games/snake/view/musics/backgroundMusic.mp3")

    // Convert the file path to URL
    val musicUrl = musicFile.toURI.toURL.toExternalForm
    val media = new Media(musicUrl)

    // Check if the background music is already playing; if not, create a new MediaPlayer
    if (backgroundMusicPlayer == null) {
      backgroundMusicPlayer = new MediaPlayer(media)

      // Adjust the volume and other settings as needed
      backgroundMusicPlayer.setVolume(0.5)
      backgroundMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE)
    }

    // Play the background music (or resume if it was already playing)
    backgroundMusicPlayer.play()
  }

  // Method to stop the background music
  def stopBackgroundMusic(): Unit = {
    if (backgroundMusicPlayer != null) {
      backgroundMusicPlayer.stop()
    }
  }
}