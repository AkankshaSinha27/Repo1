package OOps;

import java.io.FileOutputStream;

public class Except {

	public static class TryWithResources {
		public static void main(String args[]) {
			try (FileOutputStream fileOutputStream = new FileOutputStream(""))
					
					{
					
			String msg="File";
			byte byteArray[] = msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("File found");	
	}
	
	catch (Exception exception)
			{
		System.out.println("Exception");	
			}
			
			finally {
				System.out.println("default");
			}
		}
	}
}
