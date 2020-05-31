package testPackage;

public class FindMissingNumber {
	
	public int getMissingNumber(int []a){
		
		int total = ((a.length+1)*(a.length+2))/2;
		int sum=0;
		for (int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
		int missingNumber = total-sum;
		return missingNumber;
		
	}	
	
	
	public static void main(String[] args) {
		/*int myArray[] = {1,3,2,5,4,6,8,7,10};*/
		FindMissingNumber obj = new FindMissingNumber();
		System.out.println("Missing number in the given array is -->  "+obj.getMissingNumber(new int[]{1,3,2,5,4,6,8,7,10}));
		
		/*int sum=0;
		for (int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}*/

}
}
