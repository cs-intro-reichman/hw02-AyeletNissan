public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String stringSum = " = 1";
		int sum = 1;
		for(int i=2; i<num; i++){
			if (num % i == 0) {
				stringSum = stringSum + " + " + i ; 
				sum+=i;
			}
		}
		if (num == sum){
			System.out.println(num + " is a perfect number since " + num + stringSum);
		} else{
			System.out.println(num + " is not a perfect number");
		}
	}
}
