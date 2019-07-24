import akka.http.scaladsl.server.HttpApp
import akka.http.scaladsl.server.Route
import routes.Routes

object WebServer extends HttpApp {
  override def routes: Route = Routes.routes
}

object Main {
  def main(args: Array[String]): Unit = {
    WebServer.startServer("localhost", 8080)
  }
}
