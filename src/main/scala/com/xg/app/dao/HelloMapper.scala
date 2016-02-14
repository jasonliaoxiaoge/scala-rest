package com.xg.app.dao

import org.springframework.stereotype.Repository

@Repository
trait HelloMapper {
  def getAll: java.util.List[HelloDo]
}