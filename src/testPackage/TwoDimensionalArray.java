package testPackage;

public class TwoDimensionalArray {
	 public void testFunction(int lastRowNum,int lastColNum,int myArray[][]){
		  
		 
			int startRowNum = 0;
			int startColNum = 0;
			
			while(startRowNum<lastRowNum && startColNum<lastColNum ){
			for(int i=startColNum;i<lastColNum;i++){
				
				System.out.print(myArray[startRowNum][i]+" ");
			}
			startRowNum++; //start row is now 1
			
			for(int i=startRowNum;i<lastRowNum;i++){
				
				System.out.print(myArray[i][lastColNum-1]+" ");
			} 
			lastColNum--; //last col is now 3
			
			for(int i=lastColNum-1;i>=startColNum;i--){
				System.out.print(myArray[lastRowNum-1][i]+" ");
				
			}
			lastRowNum--; //Now last row num is 3
			
			for(int i=lastRowNum-1;i>=startRowNum;i--){
				System.out.print(myArray[i][startColNum]+" ");
				
			}
			startColNum++; //Now start colNum is 1
			
			}	
			
			
	 }
	

	public static void main(String[] args) {
		
		int colCount = 4;
		int rowCount = 4;
		int testArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		TwoDimensionalArray obj = new TwoDimensionalArray();
		obj.testFunction(rowCount, colCount, testArray);
		
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
