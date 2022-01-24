public class TwoSum {
    //leet code 167

    public static void main(String[] args) {
//        int[] num = {2,4,5,6,7,8,11};
        int[] num = {-1,0};
        int[] ans = twoSum(num,-1);
        for (int an : ans) {
            System.out.println(an);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
       int start = 0;
       int end = numbers.length-1;
        while (start<end){
            int sum = numbers[start]+numbers[end];
            if(sum > target){
                end--;
            }else if(sum < target) {
                start++;
            }else {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[0];
    }
}
