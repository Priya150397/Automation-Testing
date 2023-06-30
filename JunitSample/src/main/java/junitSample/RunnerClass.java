package junitSample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

//Way 1
/*@RunWith(Suite.class)
@SuiteClasses({SuiteLevelExecution.class ,A.class,B.class})*/


public class RunnerClass {
	
	//Way 2
	private void tc() {
		Result rc = JUnitCore.runClasses(B.class,A.class,SuiteLevelExecution.class);

		System.out.println("Total Test Case RunCount : " + rc.getRunCount());
		System.out.println("Total Test Case RunTime : " + rc.getRunTime());
		System.out.println("Total Test Case Failure Count : " + rc.getFailureCount());
	}
	

}
