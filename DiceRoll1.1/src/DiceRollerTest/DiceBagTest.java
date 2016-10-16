package DiceRollerTest;

import DiceRollerPD.DiceBag;

public class DiceBagTest {
	public void testRollBag(int faces, int noDices, int noRoll){
		int tm;
		DiceBag testCase;
		testCase = new DiceBag(faces, noDices);
		
		for (int i=0; i < noRoll; i++){
				testCase.rollBag();
				System.out.println(testCase);
		}
				
	}
}
