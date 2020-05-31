/*Created by : Gaurav Bhardwaj
 * Date Created : 30th may 2020
 * Description :  This program is written to find the missing number in an array of length n-1 
 * and contains number from 1 to n (any one number is missing)
 * Function created : getMissingNumber */
 

package testPackage;

public class FindMissingNumberInArray {
	
	public int getMissingNumber(int []a){
		
		
		
		int total = ((a.length+1)*(a.length+2))/2;//getting the total of from 1 to n which is (n*(n+1))/2
		
		//Adding all the numbers from array
		int sum=0;
		for (int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
		//Finding the difference between sum of array values and total of 1 to n to get the missing number
		int missingNumber = total-sum;
		return missingNumber;
		
	}	
	
	
	public static void main(String[] args) {
		/*int myArray[] = {1,3,2,5,4,6,8,7,10};*/
		FindMissingNumberInArray obj = new FindMissingNumberInArray();
		System.out.println("Missing number in the given array is -->  "+obj.getMissingNumber(new int[]{1,3,2,5,4,6,8,7,10}));
		
		/*int sum=0;
		for (int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}*/

}
}
