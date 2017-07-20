package innerClass;
//nesting a class within a method.

interface ChildrenBook{
	
}

class Book {
	public ChildrenBook getCBook(){
		return new ChildrenBook(){
			{System.out.println("hello");}// constructor instance initialization
			//anonymous class
		};
	}
}


interface Car{
	
}
public class Parcel5 {
	
	public Car car(String s){
		
		class PdCar implements Car {
			private String label;
			private PdCar(String whereTo){
				label = whereTo;
			}
			public String readLabel(){ return label; }
		}
		return new PdCar(s);
	}
	
	public static void main(String [] args){
		
		Parcel5 p = new Parcel5();
	    Car d =  p.car("toyota");
		
	}

}


