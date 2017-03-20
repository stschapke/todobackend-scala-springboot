package de.sts.todobackend

import org.springframework.web.bind.annotation.{CrossOrigin, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/todos"))
class TodoController {

  @RequestMapping
  def getTodos = List()
}
