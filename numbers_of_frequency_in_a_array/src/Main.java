import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,2,3,3};
        int count=0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                count++;
                hashMap.put(arr[i],count);
            }else {
                count=1;
                hashMap.put(arr[i],count);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(hashMap.size());

        for (Map.Entry<Integer,Integer> e: hashMap.entrySet())
            System.out.println("num: " + e.getKey() + " Count: " + e.getValue());

    }
}