package de.sts.todobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.{Bean, ComponentScan}
import org.springframework.web.servlet.config.annotation._

@ComponentScan(Array("de.sts.todobackend"))
@SpringBootApplication
class Configuration {

  @Bean
  def corsConfigurer: WebMvcConfigurer = {

    new WebMvcConfigurerAdapter {
      override def addCorsMappings(registry: CorsRegistry) = registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedHeaders("x-requested-with, origin, content-type, accept")
        .maxAge(3600)
    }
  }
}