package innerClass;

import java.util.ArrayList;

//an inner class cannot be overridden like a method.

class Egg {
	private Yolk y;
	protected class Yolk {
		public Yolk () { System.out.println("Egg.Yolk()"); }
	}
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
public class BigEgg extends Egg {
	

	public class Yolk {
		public Yolk() { System.out.println("BigEgg.Yolk()"); }
	}
	
	public static void main(String [] args){
		
		new BigEgg();
		//output: New Egg() \n Egg.Yolk()
		//since BigEgg inherited from Egg when creating a big egg object, the "internal" egg 
		//object must be created first ,then  big egg wrapped around it. 
	}
	

}
