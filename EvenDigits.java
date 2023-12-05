public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {22,2,1,3244,12,1};
        int count=0;
        for(int i = 0; i< nums.length ; i++){
            if(String.valueOf(nums[i]).length() % 2 == 0){
               count++; 
            }
        }
        System.out.println(count);
    }
}
