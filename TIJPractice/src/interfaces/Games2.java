package interfaces;

interface Game2{
	boolean toss();
}

interface GameFactory2{
	public Game2 GameFactory1(String a);
}

class Coin implements Game2 {
	private int count = 0;
	private static final int COUNT = 2;
	
	public boolean toss(){
		System.out.println("coin tossing time: "+ count);
		
		return ++count < COUNT;
	}
}

class Dice implements Game2{
	private int count = 0;
	private static final int COUNT = 6;
	
	public boolean toss() {
		System.out.println("dice tossing time: "+ count);
		return ++count < COUNT;
	}
}

class TossGameFactory implements GameFactory2 {
	
	public Game2 GameFactory1(String a){
		if ( a.equals("1"))
		return new Coin();	
		
		return new Dice();
	}
}


public class Games2 {
	
	public static void playGame(String a){
		TossGameFactory fact = new TossGameFactory();
		Game2 s = fact.GameFactory1(a);
		while(s.toss())
			;
	}
	public static void main(String []args)
	{
		playGame("1");
		playGame("2");
	}

}
