
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5);
		Integer i3 =5;
		Integer i4 =5;
		String i5="5";
		
		
		
		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); //true

		
		System.out.println(i3 == i4); 
		System.out.println(i3.equals(i4));
		System.out.println(i3.equals(i5));
		System.out.println("jay"+(i3 == i4)); 
	}

}
