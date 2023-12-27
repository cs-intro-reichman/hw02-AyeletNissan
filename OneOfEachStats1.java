public class OneOfEachStats1 {
	public static void main (String[] args) {
		int familiesNum = Integer.parseInt(args[0]);
		double firstBorn = Math.random();
		double girlorboy= Math.random();
		int sum=1;

		double average=0;
		int twokids=0;
		int treekids=0;
		int fourormorekids=0;

		for(int i=0; i<familiesNum; i++){
			if(firstBorn>=0 && firstBorn<0.5){
		  	     while (girlorboy>0 && girlorboy<0.5) {
				    sum++;
				    girlorboy = Math.random();
			    }
			    sum++;
		    } else {
			     while (girlorboy>=0.5 && girlorboy<1) {
				    sum++;
			    	girlorboy = Math.random();
		    	}
			     sum++;
		    }
			average+=sum;
			if(sum==2) twokids++;
			if(sum==3) treekids++;
			if(sum>=4) fourormorekids++;
			firstBorn = Math.random();
			sum =1;
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
