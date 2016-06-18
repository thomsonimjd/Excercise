
object Collection
{
	def main(arg:Array[String])
	{
		val colors = List("red", "blue", "green","black","white","lavandor")
		for(colors<-colors)
		{
			println(colors)
		}
		
		println(colors.head)
		println(colors.tail)
		println("Other accosser methods..")
		println("size of the List:"+colors.size)
		println("size of the List:"+colors.contains("blue"))

		println("\nStarsWith:")
		for(colors<-colors)
		{	
			if(colors.startsWith("b"))
				println(colors)
		}

		println("\nEndsWith:")
		for(colors<-colors)
		{	
			if(colors.endsWith("e"))
				println(colors)
		}
	}
}