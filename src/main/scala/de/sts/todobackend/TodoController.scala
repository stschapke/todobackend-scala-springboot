package de.sts.todobackend

import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class TodoController {

  @RequestMapping(Array("/todos"))
  def getTodos: ResponseEntity[String] = new ResponseEntity[String]("All Todos", HttpStatus.OK)
}
