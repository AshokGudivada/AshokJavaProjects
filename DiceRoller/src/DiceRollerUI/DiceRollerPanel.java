

package DiceRollerUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import DiceRollerException.NumberOfDiceRangeException;
import DiceRollerException.NumberOfFaceRangeException;
import DiceRollerPD.Dice;
import DiceRollerPD.DiceBag;
import DiceRollerTest.DiceBagTest;
/**
 * This panel Creates for GUI adds labels,spinner,roll button etc.
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 *
 */


public class DiceRollerPanel extends JPanel {

	private JButton push;
	private JLabel noFaces;
	private JLabel noDice;
	private JLabel total;
	private JLabel errorMessageLabel;
	private JLabel diceRollerLabel;
	private String errorMessage;
	private String totalBag="";
	private int count;
	
	/*public JSpinner JspinnerNoFace; 
	public JSpinner JspinnerNoDice;*/
	
	public JTextField JTextNoFace;
	public JTextField JTextNoDice;

	
	public void setTotal (String total){
		this.totalBag = total;
	}
	
	
	/**
	 * Create the panel.
	 */
	public DiceRollerPanel() {
		
		
	/*//SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
		int value = 1;
		int min = 1;
		int max = 2000;
		int step = 1;
		SpinnerNumberModel spinnerNoDice = new SpinnerNumberModel(value, min, max, step);
		JspinnerNoFace = new JSpinner(spinnerNoDice);
		SpinnerNumberModel spinnerNoFace = new SpinnerNumberModel(value, min, max, step);
		JspinnerNoDice = new JSpinner(spinnerNoFace);
	
		
	*/	
		
		
	//Labels
		
		noFaces = new JLabel ("Enter Number of Faces : ");
		this.add(noFaces);
		JTextNoFace = new JTextField(5);
		this.add(JTextNoFace);
		
	
		
		
		noDice = new JLabel ("Enter Number of Dice :    ");
		this.add(noDice);
		JTextNoDice = new JTextField(5);
		this.add(JTextNoDice);
		
	//Button	
		push = new JButton("Roll!");
		push.addActionListener(new ButtonListener());
		this.add(push);
		
		total = new JLabel("   Roll Result : "+totalBag);
		this.add(total);
		errorMessageLabel = new JLabel(" ");
		 this.add(errorMessageLabel);
		
		setBackground(Color.decode("#42f4e5"));
		setPreferredSize(new Dimension(250,250));
		
	}
	 
		/** Declare as an inner class so we can access the private class variables
		 * @author Ashok
		 *
		 */
	private class ButtonListener implements ActionListener
	{
		
	

		public void actionPerformed(ActionEvent event)
		{	
			int noFace = 1;
			int noDice = 1;
			int noRoll = 1;
			String totalRoll="";
			
			noFace = Integer.parseInt( JTextNoFace.getText());
			noDice = Integer.parseInt( JTextNoDice.getText());
			
			//
			try 
			{
				DiceBag diceBag = new DiceBag(noFace,noDice);
				diceBag.rollBag();
				totalRoll  += diceBag.toString();
				total.setText("  "+totalRoll);
				
			}
			catch (NumberOfFaceRangeException exception)
			{
				errorMessage = exception.getMessage();
				errorMessageLabel.setText(errorMessage);
				total.setText ("Total: Error");
				return;
			}
				catch (NumberOfDiceRangeException exception)
			{
				errorMessage = exception.getMessage();
				errorMessageLabel.setText(errorMessage);
				total.setText ("Total: Error");
				return;
			}

			//
			
		}
	}

}
