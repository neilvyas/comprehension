/**
 * A more convenient syntax for plotting.
 * Note that I don't fully understand existential types (using forSome),
 *   and it would probably result in as much boilerplate as writing type parameters anyway.
 */
object DSLHelpers {
  implicit class tupleAlias[T](x: T) {
    def as[U](role: U) = role -> x
  }
  //easier than `extends Map {`
  val using = Map
  implicit class mapDo[A,B](x: Map[A,B]) {
    def plot = ???
  }
}
import DSLHelpers._
