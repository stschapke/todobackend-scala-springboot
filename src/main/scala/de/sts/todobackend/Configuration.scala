package de.sts.todobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@ComponentScan(Array("de.sts.todobackend"))
@SpringBootApplication
class Configuration
