class Sum_Pro {
  var rm: Int = 0
  var rn: Int = 0
  var sum1:Int=0
  def sum(n: Int): Unit = {
    var sum: Int = 1
    for (i <- 1 to n) {
      sum = sum * i
    }
    println(sum)
    product(sum)
  }

  def product(sum: Int): Unit = {
    if (sum>0) {
      rm = sum % 10
     // println(rn)
      sum1=rm+sum1
      rn=sum/10
      product(rn )
    }
      println(sum1)
  }
  //println(sum1)
}

object Sum_Product {
  def main(args: Array[String]): Unit = {
    val sum = new Sum_Pro()
    sum.sum(6)
  }
}