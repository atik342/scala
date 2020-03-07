import scala.io.StdIn.readInt

object InputXandY {
  def main(args: Array[String]): Unit = {
    print("Enter first number:")
    var x: Int = readInt()
    
    print("Enter second number:")
    var y : Int= readInt()
    
    
    println("You Entered "+x)
    println("You Entered "+y)
     print("Total sum is:")
     println(x+y)
     
     print("the product is:")
     println(x*y)
    
  }
}