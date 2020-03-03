
public class ComboLockTester {

	public static void main(String[] args) {

		ComboLock testLock = new ComboLock(10,20,30);
		
		testLock.reset();
		
		testLock.turnRight();
		testLock.turnLeft();
		testLock.turnRight();
		
		testLock.open();
		
	}//main

}//ComboLockTester
