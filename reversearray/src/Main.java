//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void reversArray(int[] arr){
        int r= arr.length-1;

        for(int i = 0; i < arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
            r--;
        }

    }


    public static void main(String[] args) {

        int[] arr={1, 4, 3, 2, 6, 5,9};

        reversArray(arr);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

//        int[] temparr=new int[arr.length];
//
//        for(int i=0; i<arr.length; i++){
//            temparr[i]= arr[arr.length-i-1];
//        }
//        for(int i=0; i<arr.length; i++){
//            arr[i]= temparr[i];
//            //System.out.println(arr[i]);
//        }
    }
}