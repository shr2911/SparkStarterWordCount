package com.example

import org.apache.spark.sql.SparkSession
object WordCount {

  def main(args: Array[String]): Unit ={

    val spark= SparkSession
                .builder
                .master("local[*]")
                .appName("WordCount")
                .getOrCreate()



  }

}
