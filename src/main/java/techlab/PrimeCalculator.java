package techlab;

import org.springframework.stereotype.Component;

@Component(value = "primeCalculator")
public class PrimeCalculator {
	
	public int loopCalc(){
		
		long start = System.currentTimeMillis();
		
		long now = System.currentTimeMillis();
		
		int currentNum = 1;

		//test prime numbers in 100 ms
		while(now-start < 100){
			isPrime(currentNum++);
			now = System.currentTimeMillis();
		}
		
		return currentNum;
	}
	
	boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
