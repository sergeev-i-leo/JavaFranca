package franca.java.graphics

import franca.java.ui.Painter
import java.awt.Color
import java.awt.Font
import java.awt.Graphics

class GraphicsPainter(var graphics: Graphics) : Painter() {
  override fun paintText(text: String, x: Float, y: Float, deviceFontKey: String, deviceColor: Int) {
    graphics.color = Color.BLACK
    graphics.font = Font("Arial", Font.BOLD, 48)
    graphics.drawString(text, x.toInt(), y.toInt())
  }
}
