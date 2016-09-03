package dataStructureAndAlgorithmsProblemSolutions.universityOfCalifornia.coursera.simpleAlgorithmsAndComplexityTheory;

public class AlgorithmsImplementations {
	
	/**
	 * Naive O(N^2) solution
	 * 
	 */
	public  long slowMaximumPairWiseProduct(int n, int[] numbers){
		long maxResult=Long.MIN_VALUE;
		for(int i=0;i<n; i++){
			for(int j=i+1;j<n; j++){
				long temp=((long)numbers[i])*numbers[j];
				if(temp>maxResult) maxResult=temp;
			}	
		}
		return maxResult;
	}
	/**
	 *  O(N) solution
	 *  This algorithm uses the fact maxPairWiseProduct([a1,a2,a3,...])= max1 * max2
	 *  where max1 is the biggest element in the array and max2 is the second biggest element in the array
	 */
	public  long fastMaximumPairWiseProduct(int n, int[] numbers){
			int max1=Integer.MIN_VALUE;
			int max2=Integer.MIN_VALUE;
 			for(int i=0;i<n; i++){
 				if(numbers[i]>max1) {
 					max2=max1;
 					max1=numbers[i];
 				}
 				else if (numbers[i]>max2) {
 					max2=numbers[i];
 				}
 			}
 			long result=((long)max1)*max2;
 			return result;
	}
}

