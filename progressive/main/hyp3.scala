import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HypCls {

  def main(args: Array[String]) {

    val rover = new Rocks("gty")
    println("implemented name: "+rover.getName)

    val mover = new Rocks("nonn")
    mover.setName("Yellw")
    println(s"new Rocks: ${mover.getName}")
    println(mover.sayHi())


    val rythem = new Tool("rythem", "madness")
    println(rythem.sayHi())


  }


  class Rocks(var name: String){

    def this(){
      this("No Name")
    }

    this.name = setName(name)
    val id = Rocks.newIdNum

    def setName(name: String):String ={

      if (name.length >=4){this.name = name; name}

      else{this.name= "No Name da"; name}
    }

    def getName(): String = this.name

    def sayHi(): String ={
      s"hi there from rock to ${this.getName()}"
    }

  }
  object Rocks{
    private var idNmber = 0
    private def newIdNum = {idNmber+=1; idNmber}
  }

  class Tool(name: String, typo: String) extends Rocks(name){


    def this(name: String){
      this(name, "No Typo")
      this.setName(name)
    }

    def this(){
      this("No Name", "No typo")
    }

    override def sayHi(): String = {
      s"hi there from tool to ${this.getName()} with type ${this.typo}"
    }
  }
}
