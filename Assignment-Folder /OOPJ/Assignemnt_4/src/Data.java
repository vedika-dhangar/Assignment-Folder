import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Data {
     private static final int KEY = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String originalFile = "source.txt";
		 String encryptedFile = "encrypted.dat";
		 String decryptedFile = "restored.txt";
		 
		 try {
			 createFile(originalFile);
			 System.out.println("Original file created successfully!");
			 
			 encrypt(originalFile, encryptedFile );
			 
			 System.out.println("File encrypted Successfully! ");
			 
			 decrypt(encryptedFile , decryptedFile);
			 System.out.println("File decrypted Successfully ");
			 
		 }catch(IOException e) {
			 System.out.println("An error Occurred:  " +e.getMessage());
		 }
			 
		} 	 	
	public static void createFile(String filePath) throws IOException {

	    try (FileOutputStream fos = new FileOutputStream(filePath)) {

	        String message = "Hello my name is Vedika! This is my secret data.";

	        fos.write(message.getBytes());
	    }
	}
	
	public static void encrypt(String sourcePath, String desPath)throws IOException{ 
		try(FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream fos = new FileOutputStream(desPath)){
					int data;
					
					while((data = fis.read()) != -1) {
						int encryptedData = data + KEY;
						fos.write(encryptedData);
						// System.out.print((char) encryptedData);
					}
				}	
	}
	
	public static void decrypt(String sourcePath, String desPath) throws IOException{
		try(FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream  fos = new FileOutputStream(desPath)){
			int data;
			while((data = fis.read()) != -1) {
				int decryptedData = data - KEY;
				fos.write(decryptedData);
			}
		}
	}

}
