package dataStructureAndAlgorithmsProblemSolutions.universityOfCalifornia.coursera.simpleAlgorithmsAndComplexityTheory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class AlgorithmsImplementationTest {
	private final int[] simpleTest1={1,4,8,9,4};
	private final long resultSimpleTest1=9*8;
	private final int[] simpleTest2={0,33,2,9,1,1,4,7};
	private final long resultSimpleTest2=9*33;
	private final int[] cornerTest1={Integer.MAX_VALUE,Integer.MAX_VALUE};
	private final long resultcornerTest1=((long)Integer.MAX_VALUE)*Integer.MAX_VALUE;
	private final int[] cornerTest2={2,2,2,2,2};
	private final long resultcornerTest2=4;
	private final int[] orderedTest1={1,2,3,4,5};
	private final long resultOrderedTest1=5*4;
	private final int[] orderedTest2={4,3,2,1};
	private final long resultOrderedTest2=4*3;
	private  AlgorithmsImplementations impl;
	
	@Before
	public void init(){
		impl=new AlgorithmsImplementations();
	}

	@Test
	public void FastMaximumPairWiseProductTest() {
		assertEquals(impl.fastMaximumPairWiseProduct(simpleTest1.length,simpleTest1),resultSimpleTest1);
		assertEquals(impl.fastMaximumPairWiseProduct(simpleTest2.length,simpleTest2),resultSimpleTest2);
		assertEquals(impl.fastMaximumPairWiseProduct(cornerTest1.length,cornerTest1),resultcornerTest1);
		assertEquals(impl.fastMaximumPairWiseProduct(cornerTest2.length,cornerTest2),resultcornerTest2);
		assertEquals(impl.fastMaximumPairWiseProduct(orderedTest1.length,orderedTest1),resultOrderedTest1);
		assertEquals(impl.fastMaximumPairWiseProduct(orderedTest2.length,orderedTest2),resultOrderedTest2);

	}
	public void slowMaximumPairWiseProductTest() {
		assertEquals(impl.slowMaximumPairWiseProduct(simpleTest1.length,simpleTest1),resultSimpleTest1);
		assertEquals(impl.slowMaximumPairWiseProduct(simpleTest2.length,simpleTest2),resultSimpleTest2);
		assertEquals(impl.slowMaximumPairWiseProduct(cornerTest1.length,cornerTest1),resultcornerTest1);
		assertEquals(impl.slowMaximumPairWiseProduct(cornerTest2.length,cornerTest2),resultcornerTest2);
		assertEquals(impl.slowMaximumPairWiseProduct(orderedTest1.length,orderedTest1),resultOrderedTest1);
		assertEquals(impl.slowMaximumPairWiseProduct(orderedTest2.length,orderedTest2),resultOrderedTest2);
	}

}
