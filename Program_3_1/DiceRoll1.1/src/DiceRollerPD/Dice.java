package DiceRollerPD;
import java.util.Random; 
 

public class Dice {
//  initialization
	private int[] freq;//the history
	private String[] sFreq;// the history in string form for printing
	public int freqValue;// no of rolls
	private int numberFace;
	private int die;
	
	public Dice(int numberFace){
		freq = new int[numberFace];
		sFreq = new String[numberFace];
		this.numberFace = numberFace;
		freqValue=0;
		
	}

    public int rollDie(){
    	die =(int)(Math.random()* numberFace)+1;
    	
    	freq[die-1]++;
    	freqValue++;
 
    	return die;
    }
	
    public int [] getFreq(){
    	return freq;
    }
    
    public String [] getSFreq(){
    	return sFreq;
    }
    
    
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
    
    public String toString(){
    	String str = "Die :"+die;
    	return str;
    }

}
