object getNegative {

  def main(args: Array[String]): Unit = {
    var x:Int = 0
    var y:Int = 0

    do {
      print("\n Enter rational number, \n Numerator   : ")
      x = scala.io.StdIn.readInt()
      print(" Denominator : ")
      y = scala.io.StdIn.readInt()
      if (y == 0)
        print("\n Denominator must be positive")
    } while (y == 0)
    val a = new Rational(x, y)
    val b = a.neg(a: Rational)
    print("\n Output     : " + b.numer + " / " + b.deno + "\n")
  }
}
