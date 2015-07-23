package comprehension
/**
 * A more convenient syntax for plotting.
 * Note that I don't fully understand existential types (using forSome),
 *   and it would probably result in as much boilerplate as writing type parameters anyway.
 */
object DSLHelpers {
  implicit class tupleAlias[S](x: S) {
    def as[U](role: PlotOption[S, U]): U = role.apply(x)
  }

  //easier than `extends Map {`
  val using = Map
  implicit class mapDo[A, S, T](x: Map[PlotOption[S, T], A]) {
    def plot = ???
  }
}
//import DSLHelpers._
