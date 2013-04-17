import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseTest {

	public <T> String execute(Class<T> c, String input, String ... args) {
		
		// Set up the input and output streams
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		try {
			Method m = c.getMethod("main", String[].class);
			m.invoke(null, new Object[]{args});
		} catch (NoSuchMethodException |
				SecurityException |
				IllegalAccessException |
				IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			if (e.getCause() instanceof RuntimeException) {
				throw (RuntimeException)e.getCause();
			}
			else {
				throw new RuntimeException(e.getCause());
			}
		}
		
		
		return out.toString().trim();
		
	}
	
}
