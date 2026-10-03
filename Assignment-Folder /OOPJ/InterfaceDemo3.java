interface X{
	void f1();
}

interface Y extends X{
	void f2();
}

class A implements Y{
	
	public void f1(){
		System.out.println("X: f1()");
	}
	public void f2(){
		System.out.println("Y: f2()");
	}
}

public class InterfaceDemo {
	
	public static void main(String args[]){
		A a1 = new A();
		a1.f1();
		a1.f2();
		
		X a2 = new A();
		a2.f1();
		//a2.f2();//Error:CTE
		
		
		Y a3 = new A();
		a3.f1();
		a3.f2();
		
		
		
		
		
	}
}