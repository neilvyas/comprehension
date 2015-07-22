package com.github.comprehension
//we do this so that different plots can define their own required options.
trait PlotOptions

//here we handle some basic ones with a sealed ADT so that we get clues about comprehensive matches.
sealed trait GenericPlotOptions extends PlotOptions
case object Data extends GenericPlotOptions
case object Title extends GenericPlotOptions
case object X extends GenericPlotOptions
 
