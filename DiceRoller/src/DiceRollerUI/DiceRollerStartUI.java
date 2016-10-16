

package DiceRollerUI;
import javax.swing.JFrame;
/**
 * The Start class has main function where starts to run the program
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 * 
 */
public class DiceRollerStartUI {
	

	/** main class will starrt the UI
	 * @param args Pass the String[] args to main
	 */

	public static void main(String[] args) {
		
		JFrame frame = new DiceRollerFrame();
		frame.pack();		// set the size based on content
		frame.setVisible(true);// so we can see the frame
	}

}
