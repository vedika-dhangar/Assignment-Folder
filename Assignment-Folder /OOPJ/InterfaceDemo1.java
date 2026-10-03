interface Printable1{
	void print();//abstract method
	
}

interface Printable2 extends Printable1{
	
	void show();//abstract method
}

class Printer implements Printable2 {
	public void print(){
		System.out.println("Printing data....");
		
	}
	public void show(){
		System.out.println("Display content....");
		
	}
}

public class InterfaceDemo{
		
	public static void main(String args[]){
		
		Printer p1 = new Printer();//instance created
		p1.print();
		p1.show();
		
		System.out.println("Program successfully implemented with interface");
		
		
		
	}
}