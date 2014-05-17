/**
  Given an integer array A of size n (n > 0), find the subarray which has the maximum sum and return the sum (O(n) time)
  **/

class MaxSubArray{
    public static void main(String args[]){
        //"Usage: java maxSubArraySum\nBe sure to set your classpath"

        int[] array1 = {1, -2, 3, 5, -3, 2};            //returns 8
        int[] array2 = {1, -2, 3, 5, -1, 2};            //returns 9
        int[] array3 = {-100, -200};                    //returns -100

        System.out.println("Array1: {" + arrayToString(array1) + "}");
        System.out.println("Result (8): " + maxSubArraySum(array1));
        System.out.println("Array2: {" + arrayToString(array2) + "}");
        System.out.println("Result (9): " + maxSubArraySum(array2));
        System.out.println("Array3: {" + arrayToString(array3) + "}");
        System.out.println("Result (-100): " + maxSubArraySum(array3));
    }

    static String arrayToString(int[] array){
        String ret = "";
        if(array.length > 0) ret += array[0];
        for(int i = 1; i < array.length; i++)
            ret += ", " + array[i];
        return ret;
    }

    //O(n) - not correct :(
    static int maxSubArraySumBad(int[] A){
        int sum = A[0];
        for(int i = 1; i < A.length; i++){
            if(sum < A[i] + sum){
                sum += A[i];
            }
            else if(A[i] > sum){
                sum = A[i];
            }
        }

        return sum;
    }

    //correct algorithm:
    //g(i) = max(A[i], g(i-1) + A[i])
    //f(i) = max(f(i-1) A[i] not in S, g(i) A[i] in S)
    //f(i-1) is the maximum sum
    
    static int maxSubArraySum(int[] A){
        int fi = A[0], gi = A[0];
        for(int i = 1; i < A.length; i++){
            gi = Math.max(gi+A[i], A[i]);
            fi = Math.max(gi, fi);
        }
        return fi;
    }

}
