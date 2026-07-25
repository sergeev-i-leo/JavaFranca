package franca.java.ws

import franca.java.ui.Router
import franca.java.graphics.GraphicsRouter
import franca.java.skia.SkiaRouter

class WsRouter(var graphicsRouter: GraphicsRouter, var skiaRouter: SkiaRouter) : Router() {
  var wsServer: WsServer? = null
}
