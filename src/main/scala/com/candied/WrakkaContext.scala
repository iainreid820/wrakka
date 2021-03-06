package com.candied

import akka.actor.ActorSystem
import akka.http.scaladsl.model.StatusCode
import akka.util.Timeout

import scala.concurrent.{ExecutionContext, Future}

trait WrakkaContext {
  implicit def system: ActorSystem
  implicit val timeout: Timeout
  implicit val executionContext: ExecutionContext

  case class WrakkaResult[T](value: Future[Either[StatusCode, T]])
}
