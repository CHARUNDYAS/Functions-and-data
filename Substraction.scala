object Substraction {

  def main(args: Array[String]): Unit = {
    val a = new Rational(3,4)
    val b = new Rational(1,2)
   // val c = new Rational(3,7)

    val d = a-b
    print("\n Output     : " + d.numer + " / " + d.deno + "\n")
  }
}

