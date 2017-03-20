package de.sts.todobackend

import org.junit.{Before, Test}
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(classes = Array(classOf[Configuration]))
@WebMvcTest(Array(classOf[TodoController]))
@WebAppConfiguration
class TodoControllerIntegrationTest {

  @Autowired
  val webApplicationContext: WebApplicationContext = null

  var mockMvc: MockMvc = _

  @Before
  def setup():Unit = {
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
    println("## Bean Definition Names of webApplicationContext:")
    for(bean <- webApplicationContext.getBeanDefinitionNames){
      println(bean.toString)
    }
  }

  @Test
  def apiRootShouldReturn200Ok(): Unit = {
    mockMvc.perform(get("/todos"))
      .andExpect(status().isOk())
  }

  @Test
  def apiRootReturnsCorsHeader(): Unit = {
    mockMvc.perform(get("/todos").header("origin", "http://backend-todo.com"))
      .andExpect(MockMvcResultMatchers.header().string("Access-Control-Allow-Origin", "http://backend-todo.com"))
  }
}
