package controllers

import play.api.mvc._

object  Application extends Controller {
  def ping = Action (_ => Ok("pong"))

}
