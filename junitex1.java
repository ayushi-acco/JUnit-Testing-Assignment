import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ayushi1.frequency_problem;


public class junitex1 {
	static String str;
	frequency_problem t1;
	 @Before  
	    public void setUp() throws Exception {  
		 t1=new frequency_problem();
	        System.out.println("before");  
	    }  

	@Test  
    public void testFindMax(){  
        assertEquals("A##B#",t1.freqcount("AAB"));  
        assertEquals("A#B###",t1.freqcount("ABBB"));  
    }  
	
}
