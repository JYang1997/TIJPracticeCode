package innerClass;
// this is us to test the accessibility of local inner class
interface InLocal {
	
	
}
public class LocalClass {
	
	private int a = 0 ;
	final int b = 1;
	 int c  = 2;
	
	public InLocal localmethod( final String x)
	{
		int d = 3;
		 class Local implements InLocal{
			 
			 public Local() {
				 System.out.println(s);
			 }
			 
			 int f = a;
			 int c =b;
			 int s = LocalClass.this.c;
			 
			 
		}
		 
		 return new Local();
		 
	}
	
	public static void main(String [] args){
		InLocal obj = new LocalClass().localmethod("yo");
	}

}
