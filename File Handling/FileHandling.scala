	//package files
	import java.io._
	import scala.io.Source

	object FileHandling
	{
		def main(arg:Array[String])
		{
		
			val file=new File("files.txt")
			val writer=new PrintWriter(file)
			writer.write("Hello Scala")
			writer.close()
		
			println(Source.fromFile(file).mkString)

			Source.fromFile("F://Scala notes//Programs//ClassExamples.scala").foreach{ 
         			print 
      			}
		}

		class CreateFile(fileName:String)
		{
			def createFile()
			{
				val file=new File(fileName)
			}
		}
		class ReadWriteFile(fileName:File)
		{
			def wirteFile(msg:String)
			{
				val writer=new PrintWriter(fileName)
				writer.write(msg)
				writer.close()
			}
			def readFile()
			{
				Source.fromFile(fileName).foreach{ 
					print }
			}	
		}
	}

