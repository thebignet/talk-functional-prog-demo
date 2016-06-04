object Carre {

  def main(args: Array[String]): Unit = {
    println(s"mult de 2 et 3 = ${mult(2, 3)}")
    println(s"carre de 3 = ${carre(3)}")
    println(s"puissance4 de 3 = ${carre(carre(3))}")
    println(s"puissance5 de 3 = ${puissance(5)(3)}")
  }

  def mult(a: Long, b: Long): Long = a * b
  def paire(f: (Long, Long) => Long, x: Long) = f(x, x)
  def carre(x: Long) = paire(mult, x)

  def puissance(x:Long) = (y:Long) => Math.pow(y,x)
  def carre2(x: Long) = puissance(2)(x)
}
