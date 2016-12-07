package Java8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Harjoitus1 {
	
	final static List<Integer> numbers = Arrays.asList(5,10,15,20,11,16,21,26,25,3); 



    @Test 
    public void collectEvenNumbers() { 
    	int x, a, b;
    	
 
        List<Integer> boo = numbers.stream().filter(x-> x%2!=0).collect(Collectors.toList());
		System.out.println(boo);
		List<Integer> boo2 = numbers.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(boo2);
		
		numbers.sort((a,b) -> b -a);
		System.out.println(numbers);
		
		List<Double> boo3 = numbers.stream().map(x->Math.pow(x, 2)).collect(Collectors.toList());
		System.out.println(boo3);
        
        
        assertEquals((Integer)boo.size(), (Integer)4); 
        
    } 

    @Test 
    public void sortNumbers() { 
        // TODO: sort numbers 
        assertEquals(numbers.get(0), (Integer)26); 
        assertEquals(numbers.get(numbers.size()-1), (Integer)3); 
    } 

    @Test 
    public void createStringOfNumbers() { 
       // TODO: Create a string of all numbers 
       assertEquals((Integer)result.length(), (Integer)27); 
    }

}
