
package DiceRollerException;
import java.util.*;
import javax.swing.*;
/**
 * The NumberOfFaceRangeException prints the message if input number of Face is less one
 * 
 *
 * @author  Ashok Gudivada
 * @version 1.2
 * 
 */
public class NumberOfFaceRangeException extends Exception 
{
	public NumberOfFaceRangeException (String message){
		super(message);
	}
}
