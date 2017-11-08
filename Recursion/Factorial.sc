object Factorial {
  def fac(arg: Int): Int = if (arg > 0) arg * fac(arg -1) else 1
}