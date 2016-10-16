

package DiceRollerPD;
import java.util.Random;
import DiceRollerException.NumberOfDiceRangeException; 
import DiceRollerException.NumberOfFaceRangeException;

/**
 * The Dice class consists of roll method, calculating the frequencies.
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 * 
 */
public class Dice {
//  initialization
	private int[] freq;//the history
	private String[] sFreq;// the history in string form for printing
	public int freqValue;// no of rolls
	private int numberFace;
	private int die;
	
	/**
	 * constructor
	 */
	/*public Dice(int numberFace)
	{
		freq = new int[numberFace];
		sFreq = new String[numberFace];
		this.numberFace = numberFace;
		freqValue=0;
		
	}*/

	
    /** 
     * @param numberFace We check number of face to throw an exception
	 * @throws NumberOfFaceRangeException NumberOfFaceRangeException is throwed when the die is less than 1
     */
	public Dice(int numberFace) throws NumberOfFaceRangeException
	{
		
		setNumberFaces(numberFace);
		freq = new int[numberFace];
		sFreq = new String[numberFace];
		freqValue=0;
		
	}
	
	
	   
		/** checks the number of dices and throws an exception
		 * @param numberFace We check number of face to throw an exception
		 * @throws NumberOfFaceRangeException NumberOfFaceRangeException is throwed when the die is less than 1
		 */

	private void setNumberFaces(int numberFace) throws 	
	NumberOfFaceRangeException
	{
		if (numberFace <=0)  
		{
			NumberOfFaceRangeException exception = new NumberOfFaceRangeException("Number of faces must be greater than zero");
			throw exception;
		}
		else
		{
			this.numberFace = numberFace;
		}
	}
	
	
	 /**this method generates the random digits
     * @return return the roll result of the die
     */
    public int rollDie(){
    	die =(int)(Math.random()* numberFace)+1;
    	
    	freq[die-1]++; //Exception here
    	freqValue++;
 
    	return die;
    }
    
    /**getters Is use get freq of face up of a die
     * @return return the array where the freq of die is stored
     */
    public int [] getFreq(){
    	return freq;
    }
  
    
    public String [] getSFreq(){
    	return sFreq;
    }
    
    /** prints the string total of the bag and individual die results
     * @return string
     */
    public String freqString(){
    	String Str = "Dice: #face: "+numberFace+" TotalRolls: "+freqValue+"\n";
    	for(int i=0; i < numberFace; i++ ){
    		Str += " "+(i+1);
    	}
    		Str += "\n";
    		
    	for(int i=0; i < numberFace; i++ ){
    		Str += " "+ freq[i];
    	}
    	return Str;
    	
    }
    /** toString for generate die result
     * @see java.awt.Component#toString()
     */
  
    public String toString(){
    	String str = "Die :"+die;
    	return str;
    }

}
