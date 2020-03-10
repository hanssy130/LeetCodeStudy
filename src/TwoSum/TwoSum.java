package TwoSum;

import java.util.Arrays;

// My failed attempt
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < length.nums; i++) {
//            for (int j = 1; j < length.nums; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//    }
//}

//What I learned:
//I need .length to get the length
//I return arrays with curly braces
//Need to remember to have a case for illegal arguments

public class TwoSum {

    int[] myList;
    int target;

    public TwoSum(int[] myList, int target) {
        this.myList = myList;
        this.target = target;
    }

    public int[] calculate(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] myList = {1, 2, 3, 5};
        TwoSum twosum = new TwoSum(myList, 5);
        int[] newList = twosum.calculate(myList, 8);
        System.out.println(Arrays.toString(newList));
    }
}
