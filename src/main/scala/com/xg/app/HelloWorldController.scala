package com.xg.app

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Controller
@RequestMapping(Array("/hello"))
class HelloWorldController {
  
  @RequestMapping(Array("/show"))
  def showHello(request:HttpServletRequest , response:HttpServletResponse) = {
    response.getWriter().println("Hello World")
  }

}