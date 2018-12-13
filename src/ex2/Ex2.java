package ex2;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public int user_input_n1(String user_input_n1) {
    	int output;
        for (char c : user_input_n1.toCharArray()) {
            if (!Character.isDigit(c)) {
            	throw new NumberFormatException("The input must be a positive integer!");
            }
        }
        
        if(user_input_n1.length()>String.valueOf(Integer.MAX_VALUE).length()) {
        	throw new NumberFormatException("Don't exaggerate!");
        }
        
		if (Integer.valueOf(user_input_n1)>1 && Integer.valueOf(user_input_n1)<=1000000) {
			output = Integer.valueOf(user_input_n1);
		} else {
        	throw new NumberFormatException("The input must be betwee 1 and 1 million");
		}
        return output;
    }

    public int user_input_n2(String user_input_n2) {
    	int output;
    	int j = -1;

        for (char c : user_input_n2.toCharArray()) {
        	j++;
            if (!Character.isDigit(c) && (c != "-".charAt(0) | j>0)) {
            	throw new NumberFormatException("The input must be an integer!");
            }
        }
        
    	if(user_input_n2.length()>String.valueOf(Integer.MAX_VALUE).length()) {
        	throw new NumberFormatException("Don't exaggerate!");
        }

		output = Integer.valueOf(user_input_n2);
        return output;
    }
    
    public int user_input_n3(String user_input_n3, int user_input_n2) {
    	int output;
    	int j = -1;

        for (char c : user_input_n3.toCharArray()) {
        	j++;
            if (!Character.isDigit(c) && (c != "-".charAt(0) | j>0)) {
            	throw new NumberFormatException("The input must be an integer!");
            }
        }
        
    	if(user_input_n3.length()>String.valueOf(Integer.MAX_VALUE).length()) {
        	throw new NumberFormatException("Don't exaggerate!");
        }
    	
		if (Integer.valueOf(user_input_n3) > user_input_n2) {
			output = Integer.valueOf(user_input_n3);
		} else {
        	throw new NumberFormatException("The input must be greater than the second input(n2): "+user_input_n2);
		}
        return output;
    }
    
    public float[] generate_random_floats(int user_input_n1) {
    	Random rand = new Random();
    	System.out.println("List of random floats:");
    	float[] random_float_list = new float[user_input_n1];
    	for (int cnt=0; cnt<user_input_n1;cnt++) {
    		random_float_list[cnt] = rand.nextFloat();
    		System.out.println(random_float_list[cnt]);
    	}
    	System.out.print("\n\n");
    	return random_float_list;
    }
    
    public float summation(float[] list) {
    	float output = 0;
    	for(float i : list) {
    		  output = i + output;
    	} 
    	return output;
    }
    
    public float product(float[] list) {
    	float output = 1;
    	for(float i : list) {
    		  output = i*output;
    	} 
    	return output;
    }
    
    public float average(float[] list) {
    	float sum = 0;
    	for(float i : list) {
    		  sum = i + sum;
    	}
    	
    	int len = list.length;
    	float output = sum/len;
    	return output;
    }
   
    public float variance(float[] list) {
    	float sum = 0;
    	for(float i : list) {
    		  sum = i + sum;
    	}
    	
    	int len = list.length;
    	float sumSquares = 0;
    	for(float i : list) {
    		sumSquares = (float) Math.pow(i-sum/len,2) + sumSquares;
    	}
    	
    	float output = sumSquares/len;
    	return output;
    }
   
    public float smallest_float(float[] list) {
    	float output = list[0];
    	for(float i : list) {
    		if (i < output) {
    			output = i;
    		}
    	}
    	return output;
    }  
    
    public float largest_float(float[] list) {
    	float output = list[0];
    	for(float i : list) {
    		if (i > output) {
    			output = i;
    		}
    	}
    	return output;
    }
    
    public static void main(String []args) { 
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	System.out.println("Enter n1 value:");
		int user_input_n1 = new Ex2().user_input_n1(scanner.next());
    	System.out.print("\n");
    	
    	System.out.println("Enter n2 value:");
		int user_input_n2 = new Ex2().user_input_n2(scanner.next());
    	System.out.print("\n");
    	
		System.out.println("Enter n3 value:");
		new Ex2().user_input_n3(scanner.next(),user_input_n2);
    	System.out.print("\n");
    	
    	scanner.close();
    	
    	float[] random_float_list = new Ex2().generate_random_floats(user_input_n1);
    	float sum = new Ex2().summation(random_float_list);
    	float prod = new Ex2().product(random_float_list);
    	float smallest = new Ex2().smallest_float(random_float_list);
    	float largest = new Ex2().largest_float(random_float_list);
    	float ave = new Ex2().average(random_float_list);
    	float var = new Ex2().variance(random_float_list);
    	
    	System.out.println("Summation: "+sum);
    	System.out.println("Product: "+prod);
    	System.out.println("Average: "+ave);
    	System.out.println("Variance: "+var);
    	System.out.println("Smallest value: "+smallest);
    	System.out.println("Largest value: "+largest);
    }
}

