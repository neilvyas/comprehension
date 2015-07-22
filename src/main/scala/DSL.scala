package com.github.comprehension
/**
 * A more convenient syntax for plotting.
 * Note that I don't fully understand existential types (using forSome),
 *   and it would probably result in as much boilerplate as writing type parameters anyway.
 */
object DSLHelpers {
  implicit class tupleAlias[T](x: T) {
    def as(role: PlotOptions) = role -> x
  }
  //easier than `extends Map {`
  val using = Map
  implicit class mapDo[A](x: Map[PlotOptions, A]) {
    def plot(plt: PlotType) = {
      //check if required PlotOptions have been satisfied
      plt.checkOptions(x)
      //proceed to plot if the above passes.
      plt.plot(x)
    }
  }
}
import DSLHelpers._
