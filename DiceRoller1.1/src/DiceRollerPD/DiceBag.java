package DiceRollerPD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class DiceBag {
	private Dice [] dices;
	private int totalBag = 0;
	private String totalBagStr = "";
	private int noDices;
	private int faces;
	
	
	public DiceBag(int faces, int noDices) throws 	NumberOfFacesRangeException{
		this.noDices = noDices;
		setNumberFaces(faces);
		dices = new Dice [noDices];
		for (int i=0; i < noDices; i++){
			dices[i]= new Dice(faces);
		}                                                                                                                                              
	}
	
	private void setNumberFaces(int faces) throws 	NumberOfFacesRangeException
	{
		if (faces <=0)  
		{
			NumberOfFacesRangeException exception = new NumberOfFacesRangeException("Number of faces must be greater than zero");
			throw exception;
		}
		else
		{
			this.faces = faces;
		}
	}
	
	public class NumberOfFacesRangeException extends Exception
	{
		public NumberOfFacesRangeException (String msg )
		{
			super(msg);
		}
		
	}
	
	public void rollBag(){
		int tm;
		totalBagStr = "";
		totalBag = 0;
		for (int i=0; i < noDices; i++){
				tm = dices[i].rollDie();
				
				totalBag = totalBag + tm;
				totalBagStr = totalBagStr+" "+tm;
			}
				
		}
		
	
    
    public String toString(){
    	String str = "Total : "+totalBag+" Die : "+totalBagStr;
    	return str;
    }
	
}
