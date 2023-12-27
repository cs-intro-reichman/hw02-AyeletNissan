public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=1; i<=n; i++){
			if(i%2==0){
					System.out.print(" ");
			}
			for(int j=1; j<=n; j++){
				if (j==n) {
					System.out.print("*");
				} else{
					System.out.print("* ");
				}
			}
				System.out.println();
		}
		System.out.println();
	}
}
