// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            String includesAn = "AaEeFfHhIiLlMmNnOoRrSsXx";
            int times = Integer.parseInt(args[1]);

            for (int i = 0; i < word.length(); i++) {
               char letter = word.charAt(i);
               if (includesAn.indexOf(letter) == -1){
                System.out.println("Give me a  " + letter + ": " + letter + "!");
               } else {
                System.out.println("Give me an " + letter + ": " + letter + "!");
               }
            }

            System.out.println("What does that spell?");
            
            for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
            }
        }
}
