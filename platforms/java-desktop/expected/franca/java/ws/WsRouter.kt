package franca.java.ws

import franca.java.expected.Router
import franca.java.graphics.GraphicsRouter
import franca.java.skia.SkiaRouter

class WsRouter(var graphicsRouter: GraphicsRouter, var skiaRouter: SkiaRouter) : Router() {
  var wsServer: WsServer? = null
}
