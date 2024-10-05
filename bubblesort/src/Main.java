//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = { -2, 45, 0, 11, -9 };
        boolean isSwap=false;

        for(int i=0;i< nums.length;i++){
            for (int j=0;j< nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap) break;
        }

        for(int i=0;i< nums.length;i++) System.out.println(nums[i]);
    }
}