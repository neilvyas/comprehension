###comprehension  
######for { comprehending your data }
* * *

**comprehension** aims to be a terse, expressive Scala plotting DSL for (at the moment) `d3.js`, which will allow you to quickly generate visualizations and easily improve the interesting ones so that they can be used in presentations and products. Additionally, it avoids introducing library-specific concepts in favor of staying close to idiomatic base Scala.

As a language, Scala offers many features which make it possible to have a really nice plotting solution, but so far, none exist. These features include:
 - **Implicits**, which are idiomatically used for injecting configuration and context while keeping functions brief and uncluttered,
 - **Extremely flexible syntax**, which allows for easy specification of DSLs, and, of course,
 - **Support for both OOP and FP**, which means that we can use the [M word](https://en.wikipedia.org/wiki/Monad_(functional_programming)) and still be taken seriously.

* * *
######Influencers
Of course, [d3js](http://d3js.org/) is a primary influence; I haven't been using it for long, but I love its flexibility and its idioms, like `joins`, `scales`, `transitions`, and the like.

[Seaborn](http://stanford.edu/~mwaskom/software/seaborn/) because of its sensible deafults and ease of use for statistical data visualization.

The very interesting and very early [holoviews](http://ioam.github.io/holoviews/) was the first instance I saw of a library that treated plotting objects as first-class and encouraged composition to build up complex visualizations.
 
* * * 
######Alternatives
A spiritually similar solution exists in [WISP](https://github.com/quantifind/wisp), but my problems with WISP are that it uses Highcharts, which is not extremely flexible and also not free for enterprise, and that I don't like the workflow it uses, which is too stateful (it's more like `matplotlib`, in which successive commands will modify the "current" plot if no object is passed in). 

`spark-notebook` implements some JS bindings, but those are kind of ugly, and `zeppelin` has some nice auto-plotting done for you a là Databricks, but it's difficult to get those plots out of notebooks and tweak them.
