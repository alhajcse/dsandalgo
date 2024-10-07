//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = { 10, 5, 2, 8, 7 };
        int target = 7,f=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                f=1;
                break;
            }

        }
        if (f==0) {
            System.out.println("No such element");
        }


    }
}