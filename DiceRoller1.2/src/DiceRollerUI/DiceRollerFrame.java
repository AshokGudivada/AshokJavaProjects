/**
* The frame class will create the frame
* 
*
* @author Ashok Gudivada
* @version 1.2
* @date 10/06/2016
*/

package DiceRollerUI;
import javax.swing.JFrame;

public class DiceRollerFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public DiceRollerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dice Roller");
		getContentPane().add(new DiceRollerPanel());		
	}
}

