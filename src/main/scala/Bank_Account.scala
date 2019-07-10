import scala.io
import scala.io.StdIn


class Bank_Account(var name: String, var acc_no: Int, var balance: Double) {
  def display(): Unit = {
    println(this.name)
    println(this.acc_no)
    println(this.balance)
  }

  def deposite(balance: Double): Unit = {
    println(this.balance + balance)
  }

  def withdraw(balance: Double): Unit = {
    println(this.balance - balance)
  }

  def printObject() = {println(this)
   // Bank_Account { delete from "pri" objectId "myId" }

  }

object Bank_Account {
  //implicit var balance:Double=5000
  def main(args: Array[String]): Unit = {
    var choice = StdIn.readLine("Enter choice").toInt
    var bank_acc = new Bank_Account("dinesh", 123, 5000)
    bank_acc.printObject()
    choice match {

      case 1 => bank_acc.display()
      case 2 => bank_acc.deposite(300)
      case 3 => bank_acc.withdraw(100)
      case 4 => bank_acc.printObject()
    }

  }
}
