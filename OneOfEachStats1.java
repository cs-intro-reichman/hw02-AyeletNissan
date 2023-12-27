public class OneOfEachStats1 {
	public static void main (String[] args) {
		int familiesNum = Integer.parseInt(args[0]);
		int firstBorn = (int)(2*Math.random()+1);
		int girlorboy=(int)(2*Math.random()+1);
		int sum=1;

		double average=0;
		int twokids=0;
		int treekids=0;
		int fourormorekids=0;

		for(int i=0; i<familiesNum; i++){
			if(firstBorn%2==0){
		  	     while (girlorboy%2!=0) {
				    sum++;
				    girlorboy = (int)(2*Math.random()+1);
			    }
			    sum++;
		    } else {
			     while (girlorboy%2==0) {
				    sum++;
			    	girlorboy = (int)(2*Math.random()+1);
		    	}
			     sum++;
		    }
			average+=sum;
			if(sum==2) twokids++;
			if(sum==3) treekids++;
			if(sum>=4) fourormorekids++;
		}

		System.out.println("Average: "+ average/familiesNum + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ twokids);
		System.out.println("Number of families with 3 children: "+ treekids);
		System.out.println("Number of families with 4 or more children: "+ fourormorekids);
		int maxin = Math.max(twokids, Math.max(treekids, fourormorekids));
		if(maxin==twokids) System.out.println("The most common number of children is 2.");
		if(maxin==treekids) System.out.println("The most common number of children is 3.");
		if(maxin==fourormorekids) System.out.println("The most common number of children is 4 or more.");
	}
}
