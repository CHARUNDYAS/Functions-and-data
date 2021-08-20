
class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acnumber : Int = n
  var balance : Double = b

  def withdraw(a:Double):Unit = this.balance = this.balance -a
  def deposit(a:Double):Unit = this.balance = this.balance + a
  def transfer(a:Account,b:Double) :Unit = {
    this.balance = this.balance - b
    a.balance = a.balance + b
  }
}
