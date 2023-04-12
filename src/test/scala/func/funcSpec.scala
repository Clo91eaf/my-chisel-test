package func

import chisel3._
import chiseltest._
import org.scalatest.freespec.AnyFreeSpec
import chisel3.experimental.BundleLiterals._

class funcSpec extends AnyFreeSpec with ChiselScalatestTester {
   "func should calculate proper" in {
    test(new func) { c =>
      for (i <- 0 until 4) {
        c.io.input.poke(i.U)
        c.io.output.expect((i << 2).U)
      }
    }
  }
}
