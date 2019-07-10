import scala.io
import scala.io.StdIn


class Bank_Account(var name:String,var acc_no:Int,var balance:Double)
{
def display(): Unit ={
  println(this.name)
  println(this.acc_no)
  println(this.balance)
}
  def deposite( balance:Double): Unit ={
  println(this.balance+balance)
}
  def withdraw(balance:Double): Unit ={
    println(this.balance-balance)
  }
};
object Bank_Account {
  def main(args: Array[String]): Unit = {
    var bank_acc=new Bank_Account()
    var choice = StdIn.readLine("Enter choice")
    choice match {
      case 1 =>var bank_acc = new Bank_Account ("dinesh", 123, 123)
      case 2=> bank_acc.display ()
      case 3=>bank_acc.deposite (300)
      case 4=>bank_acc.withdraw (100)
//      case 5=>bank_acc.fundtranfer()
    }

  }
}