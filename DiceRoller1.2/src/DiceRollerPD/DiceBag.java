/**
* The Dicebag consists of all the properties and state of all the dices
* 
*
* @author  Ashok Gudivada
* @version 1.2
* @date 10/06/2016
*/

package DiceRollerPD;

import java.util.Arrays;
import java.util.Random;
import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;

/**
 * @author Ashok
 *
 */
public class DiceBag {
	private Dice[] dices;

	private int totalBag = 0;
	private String totalBagStr = "";
	private int noDices;
	private int faces;

	//

	///

	/**
	 * @param faces
	 * @param noDices
	 * @throws NumberOfFaceRangeException
	 * @throws NumberOfDiceRangeException
	 */
	public DiceBag(int faces, int noDices) throws NumberOfFaceRangeException, NumberOfDiceRangeException {
		setNumberDice(noDices);
		this.noDices = noDices;
		this.faces = faces;
		dices = new Dice[noDices];
		for (int i = 0; i < noDices; i++) {
			dices[i] = new Dice(faces);
		}
	}

	/**
	 * @param numberDice
	 * @throws NumberOfDiceRangeException
	 */
	private void setNumberDice(int numberDice) throws NumberOfDiceRangeException {
		if (numberDice <= 0) {
			NumberOfDiceRangeException exception = new NumberOfDiceRangeException(
					"Number of Dice must be greater than zero");
			throw exception;
		} else {
			this.noDices = numberDice;
		}
	}

	/**rollbag function rolls the dices
	 * 
	 */
	public void rollBag() {
		int tm;
		totalBagStr = "";
		totalBag = 0;
		for (int i = 0; i < noDices; i++) {
			tm = dices[i].rollDie();

			totalBag = totalBag + tm;
			totalBagStr = totalBagStr + " " + tm;
		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = "Total : " + totalBag + " Die : " + totalBagStr;
		System.out.println(str);
		return str;
	}

}
