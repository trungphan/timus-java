import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class S1001 {
	public static void main(String ... args) {
		try (Scanner scanner = new Scanner(System.in)) {
			LinkedList<Long> numbers = new LinkedList<>();
			while (scanner.hasNextLong()) {
				numbers.add(scanner.nextLong());
			}
			for (Iterator<Long> i = numbers.descendingIterator(); i.hasNext();) {
				System.out.println(String.format("%.4f", Math.sqrt(i.next()) ));
			}
		}
	}
}
