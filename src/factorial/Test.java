package factorial;

import File.File;
import timer.Stopwatch;

/**
 * Class for test
 * 
 * @author vitorbrangioni
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("docs/test.txt");
		int n = Integer.parseInt(file.readFile());
		System.out.println("Tempo Recursivo: \n");
		Stopwatch.start();
		Factorial.calculateRecursiveFactorial(n);
		System.out.println(Stopwatch.stop());

		
		System.out.println("Tempo Iterativo: \n");
		Stopwatch.start();
		Factorial.calculateIterativeFactorial(n);
		System.out.println(Stopwatch.stop());
	}
}