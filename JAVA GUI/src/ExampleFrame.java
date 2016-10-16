/**
* The frame class will create the frame
* 
*
* @author  Ashok
* @version 1.2
* @date 10/06/2016
*/


import javax.swing.JFrame;

/**basically sets the title and default close operations
 * @author Ashok
 *
 */

public class ExampleFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public ExampleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dice Roller");
		getContentPane().add(new ExamplePanel());		
	}
}

