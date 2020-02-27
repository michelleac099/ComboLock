import java.util.Scanner;
public class ComboLock {

	private int currentNumber = 0; //dial setting
	public Scanner in = new Scanner(System.in);
	private int secret1,secret2,secret3;
	private boolean unlocked = false;
	private boolean notMoved = true;
	private boolean moved1, moved2, moved3 = false;
	private boolean match1, match2, match3 = false;
	
	public ComboLock(int s1, int s2, int s3)
	{
		secret1 = s1;
		secret2 = s2;
		secret3 = s3;
	}
	
	public void reset()
	{
		currentNumber = 0;
		moved1 = false;
		moved2 = false;
		moved3 = false;
		notMoved = true;
	}
	
	public void turnLeft(int ticks)
	{
		if (moved1) {
			currentNumber = (currentNumber + ticks)%40;
			moved2 = true;
			if (currentNumber == secret2)
				match2 = true;		
		}
			
	}
	
	public void turnRight(int ticks)
	{
		if(notMoved) {
			currentNumber = (40 - ticks);
			moved1 = true;
			notMoved = false;
			if (currentNumber == secret1)
				match1 = true;
		}
		
		if(moved2) {
			currentNumber = (40 - ticks);
			moved3 = true;
			if (currentNumber == secret3)
				match3 = true;
		}
	}
	
	public boolean open()
	{
		if(match1 && match2 && match3) {
			System.out.println("You have opened the lock!");
			unlocked = true;
			return unlocked;}
		else
			System.out.println("You did not open the lock.");
			return unlocked;
	}
	
}//ComboLock
