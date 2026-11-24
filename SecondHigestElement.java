public class SecondHigestElement {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5};
        java.util.Arrays.sort(nums);
        int firstMax = 0;
        int secondMax = 0;
        // int idx =1;
        int count = 1;
        int firstElement =0;
        int secondMaxElement = 0;
        for(int i =1; i<=nums.length; i++){
            if(i<nums.length && nums[i] == nums[i-1]){
                count++;
            }else{
                if(count > firstMax){
                    secondMax = firstMax;
                    secondMaxElement = firstElement;
                    firstMax = count;
                    firstElement = nums[i - 1];
                }else if (count > secondMax && count < firstMax) {
                    secondMax = count;
                    secondMaxElement = nums[i-1];
                }
                count = 1;
            }
        }
        System.out.println(secondMax);
        System.out.println(secondMaxElement);
    }
}
