import java.util.HashSet;
import java.util.Set;

class EqulasHashcode{

	int x;
	String y;
	
	EqulasHashcode(int x,String y){
		this.x=x;
		this.y=y;
	}
	
	public static void main(String args[]){ 
	
		EqulasHashcode d1= new EqulasHashcode(10,"Raj");
		EqulasHashcode d2= new EqulasHashcode(10,"Raj");
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d1.equals(d2));
	
		Set<EqulasHashcode> dummySet = new HashSet<EqulasHashcode>();
		dummySet.add(d1);
		dummySet.add(d2);
		
		for(EqulasHashcode d:dummySet) {
			System.out.println(d.x + d.y);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqulasHashcode other = (EqulasHashcode) obj;
		if (x != other.x)
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	
}  