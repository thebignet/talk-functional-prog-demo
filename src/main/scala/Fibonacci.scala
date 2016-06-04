object Fibonacci {

  def main(args: Array[String]): Unit = {
    def max:Int = 42
    for (i <- 0 to max) {
      println(s"Fibonacci de $i : ${fib(i)}")
    }
    for (i <- 0 to max) {
      println(s"Faster Fibonacci de $i : ${fibFast(i)}")
    }
  }

  def fib(n: Long): Long = n match {
    case 0 | 1 => n
    case _ => fib(n - 1) + fib(n - 2)
  }

  def fibFast: Stream[Long] = {
    def tail(h: Long, n: Long): Stream[Long] = h #:: tail(n,h+n)
    tail(0,1)
  }
}
