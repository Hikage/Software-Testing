/**
  Given two integer arrays, find the kth element between their union (without allocating an additional array)
  **/

class KthSmallest{
    public static void main(String args[]){
        if(args.length < 1){
            System.err.println("Usage: java KthSmallest k\nBe sure to set your classpath");
            System.exit(1);
        }

        int[] array1 = {1, 5, 7, 9, 13};
        int[] array2 = {2, 6, 15, 21, 25};
        int k = Integer.parseInt(args[0]);                        //k = 5; answer = 7
        if(k > (array1.length + array2.length)) k = (array1.length + array2.length);

        System.out.println("Array1: {" + arrayToString(array1) + "}");
        System.out.println("Array2: {" + arrayToString(array2) + "}");
        System.out.println("Result (" + k + "): " + findKthSmallest(array1, array1.length, array2, array2.length, k-1));
    }

    static String arrayToString(int[] array){
        String ret = "";
        if(array.length > 0) ret += array[0];
        for(int i = 1; i < array.length; i++)
            ret += ", " + array[i];
        return ret;
    }

    //O(k)
    static int findKthSmallest(int[] A, int m, int[] B, int n, int k){
        int p1 = 0;
        int p2 = 0;
        int ret = -1;
        for(int i = 0; i <= k; i++){
            if(p1 >= A.length){
                ret = B[p2];
                p2++;
            }
            else if(p2 >= B.length){
                ret = B[p1];
                p1++;
            }
            else{
                if(A[p1] < B[p2]){
                    ret = A[p1];
                    p1++;
                }
                else{
                    ret = B[p2];
                    p2++;
                }
            }
        }

        return ret;
    }

    //TODO: O(lg m + lg n)
    static int findKthSmallestLg(int[] A, int m, int[] B, int n, int k){
        int ret = -1;
        
        //i + j = k-1
        //Bj-1 < Ai < Bj -> Ai = kth element
        //otherwise, check Bj -> Ai-1 < Bj < Ai -> Bj = kth element
        //else, compare Ai and Bj; if Bj < Ai, eliminate search space A < i and B > j; increase i, decrease j (because i+j = k-1)

        return ret;
    }
}
