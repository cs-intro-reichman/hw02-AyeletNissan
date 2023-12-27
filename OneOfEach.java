public class OneOfEach {
	public static void main (String[] args) {
		int firstBorn = (int)(2*Math.random()+1);
		int girlorboy=(int)(2*Math.random()+1);
		int sum=1;
		if(firstBorn%2==0){
			System.out.print("g ");
			while (girlorboy%2!=0) {
				System.out.print("g ");
				sum++;
				girlorboy = (int)(2*Math.random()+1);
			}
			System.out.print("b");
			sum++;
			System.out.println();
			System.out.println("You made it... and you now have " + sum + " children.");
		} else {
			System.out.print("b ");
			while (girlorboy%2==0) {
				System.out.print("b ");
				sum++;
				girlorboy = (int)(2*Math.random()+1);
			}
			System.out.print("g");
			sum++;
			System.out.println();
			System.out.println("You made it... and you now have " + sum + " children.");
		}
	}
}
