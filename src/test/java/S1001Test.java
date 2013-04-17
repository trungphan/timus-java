import org.junit.Test;
import static org.junit.Assert.*;

public class S1001Test extends BaseTest {
	
	@Test
	public void requirement() {
		
		String input = " 1427  0   \n\n   876652098643267843 \n5276538";
		String expected = "2297.0716\n936297014.1164\n0.0000\n37.7757";
		
		String output = execute(S1001.class, input);
		
		assertEquals(expected, output);
		
	}
	
	
}
