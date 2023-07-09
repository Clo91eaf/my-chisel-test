package func

import chisel3._
import chiseltest._
import org.scalatest.freespec.AnyFreeSpec
import chisel3.experimental.BundleLiterals._

class funcSpec extends AnyFreeSpec with ChiselScalatestTester {
  "func should calculate proper" in {
    test(new func) { c =>
      for {i <- 0 until 2} {
        c.io.input(i).poke(0.U)
      }
      c.io.output.expect("b10".U)
    }
  }
}
