package com.practice

object OptionTest extends App {

 
	//var name:Option[String]=Some("sd")
	//var list=List(Some("thomson"),None)
	
	//var fileName=new File(name)
	var name:Option[String]=Some(Console.readLine())
	printName(name)


	def printName(name:Option[String])=name match{
    case Some(s)=>print(s)
    case None=>print("None")
    case isEmpty=>name
  }
		
 
}
