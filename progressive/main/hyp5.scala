import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Traaaiit {

  def main(args: Array[String]) {

    val funIn = new FunClass("yerra")
    println(funIn.aFuc)
    println(funIn.bFunc)
    println(funIn.calcFunc(666))


  }

  trait ATRa{
    def aFuc: String
  }

  trait BTra{
    def bFunc: String

    def calcFunc(numb: Double):String = {
      f"this calls calcFunc for square of ${numb} is ${pow(numb,2)}"
    }
  }

  class FunClass(name: String) extends ATRa with BTra{

    def aFuc: String = s" this aFunc rocks from this ${this.name} "

    def bFunc: String = f"ths is bFunc in here!!"

  }
}
