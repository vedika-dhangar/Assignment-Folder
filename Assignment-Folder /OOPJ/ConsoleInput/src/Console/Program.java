package Console;

public static int getInt{
	{
		try {
			byte arrInput[]=new byte[100];
			System.out.println("Enter The Value ");
			int length = System.in.read(arrInput);
			byte []arrFinal = new byte[length-2];
			System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
			String objString = new String(arrFinal);
			int num1 = Integer.parseInt(objString);
			return num1;
			
		}Catch(Exception e){
			e.printStackTrace();
		}
		return -1;
		
	}

}


public class Program{
	
}