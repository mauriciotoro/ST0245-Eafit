import java.util.*;


public class Laboratory2 {


	/**
	 * Returns the product of the numbers in the list. 
	 * @param list - List of integers.
	 * @return An integer.
	 */
	public static int multiply(List<Integer> list) {
		...
	}
	
	/**
	 * Tests the methods.
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> linked = new LinkedList<>();
		linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

		ArrayList<Integer> array = new ArrayList<>();
		array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));
		
		// Multiply
		
		System.out.println(multiply(linked));
		System.out.println(multiply(array));
		
		
	}

}
