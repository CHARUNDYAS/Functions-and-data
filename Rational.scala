
class Rational(x:Int, y:Int){
  def numer:Int = x
  def deno:Int = y

  def neg(z:Rational):Rational = new Rational(-this.numer, this.deno)
  def add(z:Rational):Rational = new Rational(this.numer*z.deno + this.deno*z.numer, this.deno*z.deno)
  def -(z:Rational):Rational = this.add(z.neg(z:Rational))
}