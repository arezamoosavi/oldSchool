import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTest6 {

  def main(args: Array[String]) {

    var guessNumber = 0

    do {
      print("Guess a number: ")
      guessNumber = readLine.toInt

    } while (guessNumber != 117)

    printf("You guessed the secret: %d \n", 117)

  }
}
