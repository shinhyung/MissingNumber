package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int missingNumber(int[] nums) {
        //nums를 입력받는다. 
        
        int l = nums.length;
        int[] array = new int[l+1];
        int number=0;
        
        for(int i=0;i<l;i++) {
        	for(int k=0;k<=l;k++) {
        		if(nums[i]==k) {
        			array[k]=nums[i];
        		}
        		else {
        			
        		}
        	}
        }
        
        for(int j=0;j<array.length;j++) {
        	if(array[j]!=j) {
        		number=j;
        	}
        }
        
        return number;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().missingNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
