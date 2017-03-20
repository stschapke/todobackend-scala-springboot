package de.sts.todobackend

import org.springframework.web.bind.annotation.{CrossOrigin, RequestMapping, RestController}
import org.springframework.web.servlet.view.RedirectView

@RestController
class RootController {

  @RequestMapping(Array("/"))
  def helloWorld(): RedirectView = new RedirectView("/todos")
}
