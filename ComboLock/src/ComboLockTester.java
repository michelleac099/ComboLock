
public class ComboLockTester {

	public static void main(String[] args) {

		ComboLock testLock = new ComboLock(10,20,30);
		
		testLock.reset();
		
		testLock.turnRight(30);
		testLock.turnLeft(10);
		testLock.turnRight(10);
		
		testLock.open();
		
	}//main

}//ComboLockTester
