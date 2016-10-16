import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author Ashok
 *
 */
public class ExamplePanel extends JPanel {

	private JButton push;
	private JLabel noFaces;
	private JLabel noDice;
	private JLabel label;
	private String count="";//test of prof
	
	public JSpinner JspinnerNoFace; 
	public JSpinner JspinnerNoDice;
	
	
	
	/**
	 * Create the panel.
	 */
	public ExamplePanel() {
		
		
	//SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
		int value = 1;
		int min = 1;
		int max = 2000;
		int step = 1;
		SpinnerNumberModel spinnerNoDice = new SpinnerNumberModel(value, min, max, step);
		JspinnerNoFace = new JSpinner(spinnerNoDice);
		SpinnerNumberModel spinnerNoFace = new SpinnerNumberModel(value, min, max, step);
		JspinnerNoDice = new JSpinner(spinnerNoFace);
	
		
			
		
		
	//Labels
		
		noFaces = new JLabel ("Enter Number of Faces : ");
		this.add(noFaces);
		this.add(JspinnerNoFace);
		
		
		
		noDice = new JLabel ("Enter Number of Dice :    ");
		this.add(noDice);
		this.add(JspinnerNoDice);
		
	//Button	
		push = new JButton("Roll!");
		push.addActionListener(new ButtonListener());
		this.add(push);
		
		
	//same code 
		label = new JLabel ("TOTAL : "+ count);
		this.add(label);

		
		
		setBackground(Color.decode("#42f4e5"));
		setPreferredSize(new Dimension(250,250));
		
	}
	// Declare as an inner class so we can access the private class variables
	/**
	 * @author Ashok
	 *
	 */
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			int noFace;
			int noDice;
			count = "1 2 2 2";
			label.setText("TOTAL : "+count);
			noFace = (int) JspinnerNoFace.getValue();
			noDice = (int) JspinnerNoDice.getValue();
			
			System.out.println("JspinnerNoFace = "+noFace);
			System.out.println("JspinnerNoDice = "+noDice);
		}
	}

}
