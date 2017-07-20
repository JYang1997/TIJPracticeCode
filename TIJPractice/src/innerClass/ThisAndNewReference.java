package innerClass;



// Qualifying access to the outer-class object
/*
 * Inner class can refer to outer by using .this,  "this" would be just refer to inner itself
 * only non static method of outer class able to directly create Inner class object.
 */
public class ThisAndNewReference {
	
	public int count = 1;
	public static int staticCount = 2;//this can be access by static inner class
	
	void f() { System.out.println("Outer.f()"); }
	
	public class Inner {
		
		public ThisAndNewReference outer(){
			return ThisAndNewReference.this;
			// a plain "this" would be inner's "this"
			
		}
	}
	
	public static class InnerStatic{
		public int outer(){
			return staticCount;
		}
	}
	
	public  Inner inner() {
		return new Inner();
	}
	public static void main(String []args)
	{
		ThisAndNewReference dt = new ThisAndNewReference();
		ThisAndNewReference.Inner  dti = dt.inner();
		dti.outer().f();
	}
}

class InnerTest{
	// ways of calling inner class
	void createInner(){
		ThisAndNewReference dt = new ThisAndNewReference();
		ThisAndNewReference.Inner  dt1 = dt.inner();
		ThisAndNewReference.Inner  dt2 = dt.new Inner();
		ThisAndNewReference.Inner  dt3 = new ThisAndNewReference().new Inner();
		//static inner object, no .new needed
		ThisAndNewReference.InnerStatic st = new ThisAndNewReference.InnerStatic();
	}
}