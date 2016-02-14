package com.xg.app

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

import com.xg.app.dao.HelloMapper

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import net.sf.json.JSONArray

@Controller
@RequestMapping(Array("/db"))
class DatabaseController @Autowired() (
  val helloMapper: HelloMapper) {

  @RequestMapping(Array("/getall"))
  def showHello(request: HttpServletRequest, response: HttpServletResponse) = {
    val list = helloMapper.getAll
    val result = JSONArray.fromObject(list).toString();
    response.setContentType("application/json");
    response.getWriter.println(result)
  }

}