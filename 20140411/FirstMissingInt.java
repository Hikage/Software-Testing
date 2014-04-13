/**
  Given an integer array, find the first missing positive integer
  **/

import java.util.*;

class FirstMissingInt{
    public static void main(String args[]){
        int[] array1 = {1, 2, 0};
        int[] array2 = {-1, 2, 1, 4, 0};

        System.out.println("Result (3): " + firstMissingPositiveInt(array1));
        System.out.println("Result (3): " + firstMissingPositiveInt(array2));
    }

    static int firstMissingPositiveInt(int[] A){
        int firstInt = 1;

        //find min (>0) and max value in array
        int min = Integer.MAX_VALUE;
        int max = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < A.length; i++){
            if(A[i] < min) min = A[i];
            if(A[i] > max) max = A[i];
            numbers.add(A[i]);
        }

        if(min > 1) return 1;

        for(int i = min; i <= max; i++){
            if(!numbers.contains(i)) return i;
        }

        return max + 1;
    }
}
