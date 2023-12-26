public class Reverse {
	public static void main (String[] args){
		String s =args[0];
		for(int i=s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is "+ s.charAt(s.length()/2 - 1));;
	}
}
