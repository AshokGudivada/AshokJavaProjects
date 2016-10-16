package jUnit;

import org.junit.Test;
import org.junit.Assert.*;
import junit.framework.TestCase;

/**
 * @author ashokgudivada
 *
 */
public class NicLinkedListTest {

    /**
     * This is test NicLinkedList
     */
    @Test
    public void testAdd() {
    	@Test
        NicLinkedList a = new NicLinkedList();
    		assertNull(a.contains(1));//to checking if the root is null (linked list is empty)
        	a.add( "" );
        	Assert.assertEquals(“Should be true”, true, a.contains("") );

        	a.add( "abn" );
        	Assert.assertEquals(“Should be true”, true, a.contains("abn") );
        	
        	a.remove("abn")
        	Assert.assertEquals(“Should be true”, true, a.contains("abn") );
        	
        	a.remove("")
        	Assert.assertEquals(“Should be true”, true, a.contains("") );
        	
        	assertNull(a.contains(1));//to checking if the root is back to null (linked list is empty)
        	a.add( "" );
     }
}
