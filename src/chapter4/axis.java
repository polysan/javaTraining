package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class axis {
    public static  void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4));

//        for(int i = 0; i < intervals.length; i++){
//            for(int j = 0; j < 2; j++){
//                nums.add(intervals[i][j]);
//            }    
//        }

        for(int i = 0; i < nums.size(); i++){
            if(i==0)continue;
        	if(nums.get(i) >= nums.get(i-1)) {
        		nums.remove(i);
        		nums.remove(i-1);
        	}
        } 
        
        int[][] result = new int[nums.size()/2][2];
        
        int numIndex = 0 ;
        while(nums.size() > numIndex) {
	        for(int i = 0; i < nums.size()/2; i++) {
	        	for(int l = 0; l < 2; l++) {
	        		result[i][l] = nums.get(numIndex);
	        		numIndex++;
	        	}
	        }
        }
        
//        return result;
    }
}
