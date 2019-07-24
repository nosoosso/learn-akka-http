package routes

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import json.CreateTodoRequest
import de.heikoseeberger.akkahttpcirce.ErrorAccumulatingCirceSupport._

object Routes extends json.Json {
  val routes: Route =
    path("get-task") {
      post {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
      }
    } ~
      path("create-task") {
        post {
          entity(as[CreateTodoRequest]) { json =>
            complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"request: ${json.title}"))
          }
        }
      } ~
      path("delete-task") {
        post {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "delete"))
        }
      } ~
      path("done-task") {
        post {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "done"))
        }
      } ~
      path("undone-task") {
        post {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "undone"))
        }
      }
}
