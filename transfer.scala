

object transfer {
  var acc1 = new Account( id="111111", 1111, 50000)
  var acc2 = new Account(id ="222222", 2222, -20000)
  //var bank: List[Account] = List(var acc1 = new Account( id="111111", 1111, 50000),var acc2 = new Account(id ="222222", 2222, 20000))
  var bank: List[Account] = List(acc1,acc2)

  val find = ( n : Int , b : List[Account]) => b.filter( x => x.acnumber.equals( n ))

  val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

  val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  val interest = ( b : List[Account] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => x deposit x.balance * 0.09
      case _ => x withdraw Math.abs(x.balance) * 0.02
    }
    x
    })
  def main(args: Array[String]): Unit = {
    print("\n Account 1 ->    NIC : " + acc1.nic +"\t\t AccNo : "+ acc1.acnumber + "\t\t Bal : Rs." + acc1.balance)
    print("\n Account 2 ->    NIC : " + acc2.nic +"\t\t AccNo : "+ acc2.acnumber + "\t\t Bal : Rs." + acc2.balance)
    println("\n\n Total amount in Bank -> " + balance(bank)._2)
    println("\n\n Receiver's account -> " + find(2222, bank))
    println("\n After withdrawal -> ")
    print("\n Account 1 ->    NIC : " + acc1.nic +"\t\t AccNo : "+ acc1.acnumber + "\t\t Bal : Rs." + acc1.balance)
    print("\n Account 2 ->    NIC : " + acc2.nic +"\t\t AccNo : "+ acc2.acnumber + "\t\t Bal : Rs." + acc2.balance)

    println("\n overdraft  accounts -> " + overdraft(bank))

    bank = interest(bank)
    println("\n Interest of Bank ->")
    print("\n Account 1 ->    NIC : " + acc1.nic +"\t\t AccNo : "+ acc1.acnumber + "\t\t Bal : Rs." + acc1.balance)
    print("\n Account 2 ->    NIC : " + acc2.nic +"\t\t AccNo : "+ acc2.acnumber + "\t\t Bal : Rs." + acc2.balance)
    println("\n\n Total amount in Bank -> " + balance(bank)._2)


  }
}


