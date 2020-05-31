/*Created by : Gaurav Bhardwaj
 * Date Created : 30th may 2020
 * Description :  This program is written to print the 2D array in spiral form 
 *
 * Function created : getSpiralPrint */


package testPackage;

public class TwoDimensionalArray {
	//lastRowNum and lastColNum are the number of rows and cols not the indexes of rows and cols. ex; if there are four rows and four cols these will be passed as 4 in function
	 public void getSpiralPrint(int myArray[][]){		  
		 
			int startRowNum = 0;
			int startColNum = 0;
			int lastRowNum = myArray.length;
			int lastColNum = myArray[0].length;
			
			while(startRowNum<lastRowNum && startColNum<lastColNum ){
				
				//Printing the first row
			for(int i=startColNum;i<lastColNum;i++){
				
				System.out.print(myArray[startRowNum][i]+" ");
			}
			startRowNum++; //increment of start startRowNum from 0 to 1 in first iteration of while since first row is completely printed: row is now 1
			
			//Printing the last column starting from second row since startRowNum is 1 in first iteration of while
			for(int i=startRowNum;i<lastRowNum;i++){
				
				System.out.print(myArray[i][lastColNum-1]+" ");
			} 
			lastColNum--; //Decrement of lastColNum since last column is printed completely.last column is now 3
			
			//Priting the last row in counterClock wise
			for(int i=lastColNum-1;i>=startColNum;i--){
				System.out.print(myArray[lastRowNum-1][i]+" ");
				
			}
			lastRowNum--; //Decrement of lastRowNum since last row is printed completely.lastRowNum is now 3 after first iteration of while
			
			
			// Priting the first couln in counterClockwise starting from third row to second row
			for(int i=lastRowNum-1;i>=startRowNum;i--){
				System.out.print(myArray[i][startColNum]+" ");
				
			}
			startColNum++; //Increment of startColNum from 0 to 1 since first column is completely printed" startColNum is 1
			
			}	
			
			
	 }
	

	public static void main(String[] args) {
		
		/*int colCount = 5;
		int rowCount = 4;*/
		int testArray[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		TwoDimensionalArray obj = new TwoDimensionalArray();
		obj.getSpiralPrint(testArray);
		
		/*for (int i=0;i<4;i++){
			System.out.print(myArray[0][i]+" ");
		}
			
			for(int i=1;i<4;i++){
				
				System.out.print(myArray[i][3]+" ");
			
		}
			for(int i=2;i>=0;i--){
				System.out.print(myArray[3][i]+" ");	
				
			}
			
			for(int i=2;i>0;i--){
				System.out.print(myArray[i][0]+" ");
			}

	}
*/
}
}
