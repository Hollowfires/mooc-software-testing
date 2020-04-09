package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GettingStartedTest {
	
	GettingStarted g;
	
	@BeforeEach
	public void setup(){
		g = new GettingStarted();
	}

    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
    @Test
    public void testAddingFiveToMax() {
    	int result = new GettingStarted().addFive(Integer.MAX_VALUE);
    	Assertions.assertEquals(-2147483644, result);
    	//System.out.print(Integer.MAX_VALUE + 5);
    }
}
