interface Printable1{
	void print();//abstract method
	static int cube(int x){
		return x*x*x;
	}
	
	default int square(int x){
		return x*x;
	}
	
	private void display(){
		System.out.println("Printing data : Private method....");
	}
	
	
}



class Printer implements Printable1 {
	public void print(){
		System.out.println("Printing data....");
		
	}
	
}

public class InterfaceDemo2{
		
	public static void main(String args[]){
		
		Printer p1 = new Printer();//instance created
		p1.print();
				
		System.out.println("Cube="+Printable1.cube(2));
		System.out.println("Square="+p1.square(5));
		//System.out.println("Square="+p1.square1(6));//Error
		System.out.println("Program successfully implemented with interface");
		p1.display;
		
		
		
	}
}