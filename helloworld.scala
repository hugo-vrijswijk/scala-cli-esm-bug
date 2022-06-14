//> using platform "scala-js"
//> using jsModuleKind "es"

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("./foo.mjs", "double")
def double(x: Int): Int = js.native

@main def main =
  val n = 4
  println(s"Twice $n is ${double(n)}")
