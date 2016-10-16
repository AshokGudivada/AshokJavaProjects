package DiceRollerTest;

import DiceRollerPD.DiceBag;
import DiceRollerPD.DiceBag.NumberOfFacesRangeException;

public class DiceBagTest {
	public void testRollBag(int faces, int noDices, int noRoll){
		int tm;
		DiceBag testCase;
		try {
			testCase = new DiceBag(faces, noDices);
			for (int i=0; i < noRoll; i++){
				testCase.rollBag();
				System.out.println(testCase);
		}
		} catch (NumberOfFacesRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
}
