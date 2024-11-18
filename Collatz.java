// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mood = args[1];

		for (int i = 1; i <= n; i++) {
			int newnum = i;
			String result = newnum + " ";

			int steps = 1;
			while (newnum != 1 || steps == 1) {
				if (newnum % 2 == 0) {
					newnum = newnum /2;
				} else {
					newnum = (newnum * 3) + 1;
				}
				result = result + newnum + " ";
				steps++;
			}

			if (mood.equals("v")) {
				System.out.println(result + "(" + steps + ")");
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
