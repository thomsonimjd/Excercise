import java.io.File
object FileMatching
{
	def main(arg:Array[String])
	{
		val file=new File(".").listFiles
		//println(file)		
	
		/*for(file<-file)
		{
			println(file.getName)		
		}*/

		val file1=new FileMatcher(file)
		file1.fileMatcher(".scala	")
	}
	class FileMatcher(file:Array[File])
	{
		def fileMatcher(name:String)
		{
			for(file<-file)
			{
				if(file.getName.endsWith(name))
				{
					println(file.getName)
				}
			}
		}
	}

	class FileWriter()
	{
		val file1=new File("test.txt")
		val writer=new PrintWriter(file1)
		try{
			writer.	println("ok")
		}
		finally{	
			writer.close()	
		}
	}
}