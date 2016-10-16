


package DiceRollerTest;

import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;
import DiceRollerPD.Dice;
/** The DiceTest class tests the Dice class
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 *
 */
public class DiceTest {
	/**
	 * The DiceTest class tests the Dice class
	 * 
	 * @param noFace Number of face each die in Dicesbag will have
	 * @param rolls Number for times die should roll
	 * @throws NumberOfDiceRangeException If the number dice in the bag is less than 1 exception is thrown
	 * @throws NumberOfFaceRangeException If the number face in the bag is less than 1 exception is thrown
	 *
	 * @author  Ashok Gudivada
	 * @version 1.2
	 * 
	 */
	public void testDieFrq(int noFace, int rolls) throws NumberOfDiceRangeException, NumberOfFaceRangeException{
		Dice die;
		die = new Dice(noFace);
		for(int i = 0; i < rolls; i++ ){
			die.rollDie();
		}
		System.out.println(die.freqString());
	}

}
