package DiceRollerPD;
import java.util.Arrays;

public class DiceBag {
	private Dice [] dices;
	private int totalBag = 0;
	private String totalBagStr = "";
	private int noDices;
	private int faces;
	
	
	public DiceBag(int faces, int noDices){
		this.noDices = noDices;
		this.faces = faces;
		dices = new Dice [noDices];
		for (int i=0; i < noDices; i++){
			dices[i]= new Dice(faces);
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
