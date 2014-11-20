package fibonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

	/**
	 * Given an array of ints, this method returns a sorted List that contains
	 * the Fibonacci numbers in the input list. The list returned contains the
	 * Fibonacci numbers in ascending order and has no duplicates.
	 * 
	 * @param inputArray
	 * @return a list of all the Fibonacci numbers in inputArray, in ascending
	 *         order, with no duplicates. If the input array is null or does not
	 *         contain any Fibonacci numbers then an empty list is returned.
	 */
	public static List<Integer> getFibonacciNumbers_sorted(Integer[] inputArray) {
	    List<Integer> outputList = new ArrayList<Integer>();
	    List<Integer> fibList = new ArrayList<Integer>();
	    int fibNum1 = 1;
	    int fibNum2 = 2;
	    int store;

	    if(inputArray == null)
	        return outputList;
	    
	    if(inputArray.length == 1){
	        outputList.add(inputArray[0]);
	        return outputList;
	    }
	    int size = inputArray.length;
	    
        for(int i = 1; i < size; i++){ //move through each element in the passed array
            
            while(fibNum2 < (inputArray[i] + 1)){ //compute all 
               fibList.add(fibNum1);
               store = fibNum2;
               fibNum2 = fibNum1 + fibNum2;
               fibNum1 = store;
                
            }
            
            if(fibList.contains(inputArray[i])){ //if the value at index i is a Fibonacci num, add to output
                outputList.add(inputArray[i]);
            }       
                
            
        } 
        
	    
	    Collections.sort(outputList); // sort list
		return outputList; 
	}


}
