import scala.collection.mutable.ListBuffer

trait Queue{
  def dequeue( list: ListBuffer[Int]){
    list.remove(0)
  }

  def enqueue(list: ListBuffer[Int]){
    var num=100
    list.addOne(num)
  }
}

class DoubleQueue( l:ListBuffer[Int]) extends Queue{
  for( i <-0 to l.length-1){
    l.update(i,2*l(i))
  }
}

class SquareQueue(l:ListBuffer[Int]) extends Queue{
  for( i <-0 to l.length-1) { // Iterating the list
    l.update(i, l(i) * l(i))
  }
}


object Oops{
  def main(args:Array[String]){

    val list = ListBuffer(1, 3, 5, 7, 9, 11, 13, 17,23)
    println("Given "+list)
    var s= new DoubleQueue(list)
    println("This is double "+list)


    s.dequeue(list)
    println("List after dequeue "+list)


    s.enqueue(list)
    println("List after enqueue "+list)

    var w=new SquareQueue(list)
    println("This is squared "+list)

  }
}
