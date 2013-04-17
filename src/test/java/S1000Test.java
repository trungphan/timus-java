import org.junit.Test;
import static org.junit.Assert.*;

public class S1000Test extends BaseTest {

	@Test
	public void requirement() {
		String input = "1 5";
		String expected = "6";
		
		String output = execute(S1000.class, input);
		
		assertEquals(expected, output);
	}
	
}
