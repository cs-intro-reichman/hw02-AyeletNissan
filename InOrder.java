public class InOrder {
	public static void main (String[] args) {
		int time = (int)(10*Math.random() + 1); // לבדוק כמה פעמים
		int firstnum=(int)(10*Math.random());
		int num=0;
	    System.out.print(firstnum);
		System.out.print(" ");
	    int i=1;
		while (i<time) {
			num = (int)(10*Math.random());
			if (num>=firstnum) {
				System.out.print(num);
				System.out.print(" ");
				firstnum=num;
				i++;
			}
		}
	}
}
