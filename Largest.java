package Day3;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[] {23,45,67,78,98,};
int m=arr[0];
for(int a=0;a<arr.length;a++) {
	if(arr[a]>m) 
		m=arr[a];
}
	System.out.println("Largest Number is:"+m);

	}

}
