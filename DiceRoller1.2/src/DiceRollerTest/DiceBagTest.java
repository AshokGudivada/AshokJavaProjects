/**
* The DiceBag class tests the DiceBag class
* 
*
* @author  Ashok Gudivada
* @version 1.2
* @date 10/06/2016
*/
package DiceRollerTest;

import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;
import DiceRollerPD.DiceBag;
import DiceRollerPD.DiceBag;

public class DiceBagTest {
	public void testRollBag(int faces, int noDices, int noRoll) throws NumberOfFaceRangeException, NumberOfDiceRangeException{
		int tm;
		String total; 
		DiceBag testCase;
		testCase = new DiceBag(faces, noDices);
		for (int i=0; i < noRoll; i++){
			testCase.rollBag();
			System.out.println(testCase);
			
		}
		
		
				
	}
}
