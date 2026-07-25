package franca.java

import franca.java.expected.IntegerConsumer
import franca.java.ui.Router
import franca.java.expected.StringConsumer
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

open class JavaDesktopRouter : Router() {

  override fun getTime(): Long {
    return System.nanoTime() / 1000000
  }

  override fun readFile(path: String, callback: StringConsumer) {
    Thread {
      try {
        val content = Files.readString(Paths.get(path), StandardCharsets.UTF_8)
        callback.accept(content)
      } catch (exception: Exception) {
        exception.printStackTrace()
        callback.accept(null)
      }
    }.start()
  }

  override fun writeFile(path: String, content: String, callback: IntegerConsumer) {
    Thread {
      try {
        Files.writeString(Paths.get(path), content, StandardCharsets.UTF_8)
        callback.accept(200)
      } catch (exception: Exception) {
        exception.printStackTrace()
        callback.accept(null)
      }
    }.start()
  }
}
