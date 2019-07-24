package json

import io.circe.generic.semiauto._
import model.Todo

case class CreateTodoRequest(title: String)

trait Json {
  implicit val todoDecoder = deriveDecoder[Todo]
  implicit val todoEncoder = deriveEncoder[Todo]

  implicit val createTodoRequestDecoder = deriveDecoder[CreateTodoRequest]
}
