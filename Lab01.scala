package sparkcore

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf


object Lab01 {
  
  def main(args:Array[String])=
  {
    println("Welcome to Spark....")
    
    val sc = new SparkContext(new SparkConf().setAppName("First-Spark").setMaster("local"))
    
    val lst = List(10,20,30)
    
    val rdd = sc.parallelize(lst)
    
    val total = rdd.sum()
    
    print(s"Total value:$total")

    println("++++++++++++++++++")
 
  }
}
