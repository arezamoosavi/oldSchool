object ScalaTest5 {

  def main(args: Array[String]) {

    def printStuff(): Unit = {
      val printList = List(6, 5, 77, 785, 653, 6790)
      for (i <- printList) {
        if (i == 11) {
          return
        }
        if (i != 785) {
          println("item is " + i)
        }
      }
    }

    printStuff

  }
}
