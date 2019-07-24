package model

import java.time.Instant

case class Todo(id: Long, title: String, done: Boolean, updatedAt: Instant)
