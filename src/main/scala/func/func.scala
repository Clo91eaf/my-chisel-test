// See README.md for license details.
package func

import chisel3._
import chisel3.util._

class funcBundle extends Bundle {
  val input = Input(Vec(2, UInt(1.W)))
  val output = Output(UInt(2.W))
}

class func extends Module {
  val io = IO(new funcBundle)
  io.output := Cat(io.input(1), io.input(0))
}
