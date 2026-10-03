//import java.util.*;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//public class Main {
//
//	public static void main1(String[] args) {
//		BufferedReader reader=null;
//		BufferedWriter writer = null;
//		try {
//			File myfile = new File("out.txt");
//			if(myfile.createNewFile()) {
//				System.out.println("File created " +myfile.getName());
//			}else {
//				System.out.println("Already exists");
//			}
//			writer = new BufferedWriter(new FileWriter("out.txt"));
//			writer.write("Hello your file is created ");
//			writer.close();
//			System.out.println("file written successfully");
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
