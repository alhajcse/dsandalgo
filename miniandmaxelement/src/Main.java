//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 5, 2, 3,10 };
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i< arr.length;i++){
            //Max element
            if(max<arr[i]){
                max=arr[i];
            }
            // Min element
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Max element: "+max);
        System.out.println("Min Element: "+min);

    }
}