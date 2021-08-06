import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt
trait Queue {
  def dequeue( list: ListBuffer[Int]): Unit = {
    list.remove(0)
  }
  def enqueue(list: ListBuffer[Int]): Unit = {
    println("\nEnter a value to enqueue a no to the list: ")
    var num=readInt()
    list.addOne(num)
  }
}