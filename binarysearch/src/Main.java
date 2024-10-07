//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,7,9,10,11};
        int target=9,left=0,right=nums.length-1,mid=0,f=0;

        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                System.out.println("Target element is: "+nums[mid]);
                f=1;
                break;
            } else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }
        }

        if(f==0){
            System.out.println("No search element found");
        }
    }
}