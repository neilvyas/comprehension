package com.github.comprehension

case object NumBins extends PlotOptions

object Histogram extends PlotType {
  //Numbins is technically optional, we can infer it if it's not there, so maybe an override of checkOptions is in order.
  val plotRequiredOptions = List(Data, NumBins)
  def plot(params: Params): String = {
    params map {
      case (Data, x: Iterable[Number]) =>
        "You passed in iterable numeric data!"
      case (Data, _) =>
        "boohoo you goofed."
      case (Numbins, x: Int) => 
        s"You asked for $x bins, yay!"
      case _ => 
        "I'm tired of checking stuff already!"
    }
  }
}

