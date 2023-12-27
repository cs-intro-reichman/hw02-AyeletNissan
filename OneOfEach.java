public class OneOfEach {
	public static void main (String[] args) {
		double firstBorn = Math.random();
		double girlorboy= Math.random();
		int sum=1;

		if(firstBorn>=0 && firstBorn<0.5){
			System.out.print("g ");
			while (girlorboy>=0 && girlorboy<0.5) {
				System.out.print("g ");
				sum++;
				girlorboy = Math.random();
			}
			System.out.print("b");
			sum++;
			System.out.println();
			System.out.println("You made it... and you now have " + sum + " children.");
		} else {
			System.out.print("b ");
			while (girlorboy>=0.5 && girlorboy<1) {
				System.out.print("b ");
				sum++;
				girlorboy = Math.random();
			}
			System.out.print("g");
			sum++;
			System.out.println();
			System.out.println("You made it... and you now have " + sum + " children.");
		}
	}
}
