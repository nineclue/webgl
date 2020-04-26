package opengl.chap2

import org.scalajs.dom._
import org.scalajs.dom.raw.WebGLRenderingContext

object Chap2 {
    def main(arg: Array[String]): Unit = {
        val can = document.getElementById("webgl").asInstanceOf[html.Canvas]
        val gl = can.getContext("webgl").asInstanceOf[raw.WebGLRenderingContext]
        gl.clearColor(0.0, 0.0, 0.0, 1.0)
        gl.clear(WebGLRenderingContext.COLOR_BUFFER_BIT)
    }
}