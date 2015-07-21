package com.github.comprehension

sealed trait PlotOptions
case object Data extends PlotOptions
case object Title extends PlotOptions
case object X extends PlotOptions
