package com.example

import com.typesafe.config.{Config, ConfigFactory}

class ConfigLoader {

  private val config: Config = ConfigFactory.load("conf/app.conf")

  def fileType: String =config.getString("input.fileType")
  def filePath: String = config.getString("input.filePath")
  def textColumn: String = config.getString("input.description")

}
