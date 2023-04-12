// See README.md for license details.
package func

import chisel3._


class funcBundle extends Bundle {
  val input = Input(UInt(2.W))
  val output = Output(UInt(4.W))
}

class func extends Module {
  val io = IO(new funcBundle)

  def test(in: UInt): UInt = {
    val out = Wire(UInt(4.W))
    out := in << 2.U
    out
  }

  io.output <> test(io.input)
}
