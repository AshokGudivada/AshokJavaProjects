/**
* The DiceTest class tests the Dice class
* 
*
* @author  Ashok Gudivada
* @version 1.2
* @date 10/06/2016
*/

package DiceRollerTest;

import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;
import DiceRollerPD.Dice;

public class DiceTest {
	public void testDieFrq(int noFace, int rolls) throws NumberOfDiceRangeException, NumberOfFaceRangeException{
		Dice die;
		die = new Dice(noFace);
		for(int i = 0; i < rolls; i++ ){
			die.rollDie();
		}
		System.out.println(die.freqString());
	}

}
