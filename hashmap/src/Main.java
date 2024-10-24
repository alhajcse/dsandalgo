import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a HashMap of Integer keys and String values
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1,1);
        hashMap.put(2,2);
        // Displaying the HashMap (which is empty at this point)
        System.out.println("HashMap Elements: " + hashMap.get(1));
    }
}