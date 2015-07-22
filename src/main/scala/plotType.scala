package com.github.comprehension
import scala.reflect.runtime.universe._

trait PlotType {
  type Params[A] = Map[PlotOptions, A]
  val plotRequiredOptions: List[PlotOptions]
  def checkOptions[A: TypeTag](params: Params[A]) {
    //could also check type information if you change the type of plotRequiredOptions.
    plotRequiredOptions foreach { x =>
      params getOrElse(x, {
        //TODO: better Exception, include required Type(s)
        throw new Exception(s"Missing required param $x.")
      })
    }
  }
  def plot(params: Params)
}
