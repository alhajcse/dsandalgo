//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };
        int n = 5;

        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        // Calculate the expected sum
        int expectedSum = (n * (n + 1)) / 2;

        //the missing number
        System.out.println(expectedSum - sum);

    }
}