package comprehension

sealed trait PlotOption[S, T] {
  def apply(x: S): T
}

case class Data(s: String)

object constructors {
  case object data extends PlotOption[String, Data] {
    def apply(s: String) = Data(s)
  }
}
