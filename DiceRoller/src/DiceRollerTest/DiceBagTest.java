/**
 * The DiceBag class tests the DiceBag class
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 * 
 */
package DiceRollerTest;

import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;
import DiceRollerPD.DiceBag;
import DiceRollerPD.DiceBag;

public class DiceBagTest {
	/**
	 * The DiceBag class tests the DiceBag class
	 * 
	 * @param faces Number of face each die in Dicesbag will have
	 * @param noDices Number of Dices in DicesBag
	 * @param noRoll Number for times die should roll
	 * @throws NumberOfFaceRangeException If the number face of die is less than 1 exception is thrown
	 * @throws NumberOfDiceRangeException If the number dice in the bag is less than 1 exception is thrown
	 *
	 * @author  Ashok Gudivada
	 * @version 1.2
	 * 
	 */
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
