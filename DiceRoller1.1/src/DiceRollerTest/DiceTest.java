package DiceRollerTest;

import DiceRollerPD.Dice;

public class DiceTest {
	public void testDieFrq(int noFace, int rolls){
		Dice die;
		die = new Dice(noFace);
		for(int i = 0; i < rolls; i++ ){
			die.rollDie();
		}
		System.out.println(die.freqString());
	}

}
