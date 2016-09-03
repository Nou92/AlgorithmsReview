package dataStructureAndAlgorithmsProblemSolutions.universityOfCalifornia.coursera.simpleAlgorithmsAndComplexityTheory;
/**
 * 
 * @author Amine
 *	Implementations of :
 *	- MaximumPairWiseProduct Computation
 *  - Fibonnaci Number Computation
 *  - GCD Computation
 */
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
	/**
	 * Naive O(2^N) solution
	 */
	public int slowFibonnaciNumber(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		else return slowFibonnaciNumber(n-1)+slowFibonnaciNumber(n-2);
	}
	/**
	 * O(N) solution
	 * This algorithm uses memorization to avoid repeating 
	 * previous computations
	 * @param n
	 * @return
	 */
	public int fastFibonnaciNumber(int n){
		int[] tempResults= new int[n+1];
		tempResults[0]=0;
		tempResults[1]=1;
		for(int i=2;i<=n;i++){
			tempResults[i]=tempResults[i-1]+tempResults[i-2];
		}
		return tempResults[n];
	}
	/**
	 * Veryyyyy slow
	 * @param a
	 * @param b
	 * @return
	 */
	public int slowGcd(int a,int b){
		if(a == 0 || b == 0) return 0;
		int maxGcd=Math.min(a,b);
		int result=1;
		for(int i=2;i<=maxGcd;i++){
			if(a % i == 0 && b%i == 0) result=i;
		}
		return result;
	}
	/**
	 * O(log(ab))
	 * Uses the fact that GCD(a,b)=GCD(a',b) where a'=a%b
	 * @param a
	 * @param b
	 * @return
	 */
	public int fastGcd(int a,int b){
		if( b == 0 ) return a;
		else return fastGcd(b,a%b);
		
	}
}

