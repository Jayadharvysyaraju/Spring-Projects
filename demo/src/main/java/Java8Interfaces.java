
interface Interface1 {

	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
}


interface Interface2 {

	void method1(String str);
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
}


interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check in interface");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

public class Java8Interfaces implements Interface1,Interface2,MyData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 inter = new Java8Interfaces();
		
		inter.log("jay");
		
		
		Java8Interfaces obj = new Java8Interfaces();
		obj.print("");
		obj.isNull("abc");
		obj.print("jayadhar");

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	public void log(String str) {
		// TODO Auto-generated method stub
		Interface2.super.log(str);
	}
	
	public boolean isNull(String str) {
		System.out.println("Interface Null Check in class");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
