package Day3;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] d=new int[] {2,3,4,4,6,7,8,8,9,5,3};
		for(int s=0;s<d.length;s++) {
			for(int b=s+1;b<d.length;b++) {
				if(d[s]==d[b])
					System.out.println("Duplicate value in Array:"+d[b]);
			}
		}
	}

}
