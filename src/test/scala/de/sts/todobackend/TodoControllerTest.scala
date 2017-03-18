package de.sts.todobackend

import org.junit.{Before, Test}
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@RunWith(classOf[SpringJUnit4ClassRunner])
@WebAppConfiguration
class TodoControllerTest {

  var mockMvc : MockMvc = null

  @Before
  def setUp() : Unit = {
    mockMvc = MockMvcBuilders.standaloneSetup(new TodoController()).build()
  }

  @Test
  def helloWorldMessageWhenNameParameterIsNotSet(): Unit = {
    mockMvc.perform(get("/todos"))
      .andExpect(status().isOk())
      .andExpect(MockMvcResultMatchers.content().string("All Todos"))
  }
}
