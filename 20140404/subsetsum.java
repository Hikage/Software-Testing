/**
  Given an integer array sorted in ascending order and an integer target,
  find the indices of two elements that sum to the target
  **/

//TODO: Account for negative elements

class SubsetSum{
    public static void main(String args[]){
        int[] array = {1, 3, 5, 7, 8, 13};
        int target = 11;

        int[] indices = twoSum(array, target);

        System.out.println("Indices: " + indices[0] + " " + indices[1]);
    }

    static int[] twoSum(int[] A, int target){
        int[] indices = {0, 0};

        for(int i = A.length-1; i >= 0; i--){
            if(A[i] >= target) continue;
            
            for(int j = 0; j < i; j++){
                if(A[i] + A[j] == target){
                    indices[0] = j;
                    indices[1] = i;
                }
                else if(A[i] + A[j] > target){
                    j = i;
                    continue;
                }
            }
        }

        return indices;
    }
}
