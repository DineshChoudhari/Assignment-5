class Fibonacci {
  var n3:Int=0
  var n1: Int = 0
  var n2: Int = 1
  print(""+n1,""+n2)
  def fibo(n: Int): Unit = {

    //var n3: Int
    if (n > 1) {
      n3 = n1 + n2
      n1 = n2
      n2 = n3
      print(" "+n3)
      fibo(n - 1)
    }
  }

}
object Test {
  def main(args: Array[String]): Unit = {
    val fib=new Fibonacci();
    fib.fibo(3)
  }
}