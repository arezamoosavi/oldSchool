import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Traaaiit {

  def main(args: Array[String]) {

    val log10Func = log10 _
    List(5.77, 553, 112, 777777, 7856, 0.00000045).map(log10Func).foreach(println)

    println("\n\n\n")

    List(5,34,67,222,8742).map((x: Int)=> exp(x)).foreach(println)

    println("\n\n\n")

    def times3(num: Int) = pow(num, 3)
    def multiN(func: (Int)=> Double, num: Int)={
      func(num)
    }

    println("multi it: \n" + multiN(times3, 100))

  }
}
