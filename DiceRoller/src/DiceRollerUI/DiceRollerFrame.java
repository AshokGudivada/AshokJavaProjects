

package DiceRollerUI;
import javax.swing.JFrame;
/**
 * The frame class will create the DiceRollerFrame
 * 
 *
 * @author Ashok Gudivada
 * @version 1.2
 * 
 */
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

