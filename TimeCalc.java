public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int minutesToAdd = Integer.parseInt(args[1]);
		int totalminutes = (hours * 60) + minutes + minutesToAdd;
		int totalhours = totalminutes / 60;
		int newhour = totalhours % 24;
		int newminutes = totalminutes - (totalhours * 60);
		if (newhour >= 10){
			System.out.print(newhour);
		} else {
			System.out.print("0" + newhour);
		}
		System.out.print(":");
		if (newminutes >= 10){
			System.out.print(newminutes);
		} else {
			System.out.print("0" + newminutes);
		}
    }
}
