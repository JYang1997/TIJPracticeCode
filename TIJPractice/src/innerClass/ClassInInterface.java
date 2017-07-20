package innerClass;
//Alternative interface use
public interface ClassInInterface {
	
	void howdy();
	
	class Test implements ClassInInterface{

		@Override
		public void howdy() {
			System.out.println("Howdy!");
			
		}
		public static void main(String [] args){
			System.out.println("wt?!?!");
		}
		
	}
	
	public static void main(String [] args){
		System.out.println("hahahah");
	}

}
