//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 8, 7 };
        int min = 0;
        for (int i = 0; i < nums.length-1; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}