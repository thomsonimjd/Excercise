object TraitsExp 
{
	def main(arg:Array[String])
	{
		val con=new ConstructorExp("Constructor Examples....")
		con.sayHi
	
		val obj=new Pegion
		obj.fly()
		obj.swim()
		val obj2=new Cock
		obj2.fly()

		val group= List(new Pegion, new Cock)
		group.foreach(group=>group.fly())

		for(group<-group)
		{
			group.fly()
			group.swim()
		}

	}	
	abstract class Bird 
	{
    		def flyMessage: String
    		def fly() = println(flyMessage)
    	}
	class Pegion extends Bird with Swimming
	{
		val flyMessage="Pegion flying"
	}
	class Cock extends Bird with Swimming
	{
		val flyMessage="Cock flying"
	}
	trait Samp1 
	{
		def printDis()=println("check...")
	}
	trait Samp2 
	{
		def printDis1()=println("check2...")
	}
	trait Swimming 
	{
		def swim() = println("  &Can swim")
	}

	class ConstructorExp(messge:String)
	{
		def  sayHi()	
		{
			Console.WriteLine(messge)
			println(messge)
		}
	}
}

			