object ScalaTest3 {

    def main(args: Array[String]){

        val obj_list = List(1,2,3,4,5)

        for( i <- obj_list)
            println("list item: "+ i)
        
        for( i <- obj_list){
            println("list item: ", i)
            }
            
    }
}
