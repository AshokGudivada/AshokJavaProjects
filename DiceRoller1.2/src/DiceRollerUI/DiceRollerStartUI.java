/**
* The Start class has main function where starts to run the program
* 
*
* @author  Ashok Gudivada
* @version 1.2
* @date 10/06/2016
*/

package DiceRollerUI;
import javax.swing.JFrame;

public class DiceRollerStartUI {
	

	/** main class
	 * @param args
	 */

	public static void main(String[] args) {
		
		JFrame frame = new DiceRollerFrame();
		frame.pack();		// set the size based on content
		frame.setVisible(true);// so we can see the frame
	}

}
