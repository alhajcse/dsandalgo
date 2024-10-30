import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConverterInJava {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int intValue=15;
        double doubleValue=15;
        char charValue='A';
        boolean boolValue=true;
        String str="AB";

        System.out.println("1.Primitive to Wrapper Classes and Vice Versa (Autoboxing and Unboxing)");
        Integer integer = Integer.valueOf(intValue);
        System.out.println("int to Integer Autoboxing: " + integer);
        int i1 = integer.intValue();
        System.out.println("Integer to int Unboxing: " + i1);
        Double aDouble = Double.valueOf(doubleValue);
        System.out.println("double to Double Autoboxing: " + aDouble);
        double aDouble1 = aDouble;
        System.out.println("Double to double Unboxing: " + aDouble1);
        System.out.println();

        System.out.println("2.String Conversions");
        String intToString = String.valueOf(intValue);
        System.out.println("int to String: "+intToString);
        int stringToInt = Integer.parseInt(intToString);
        System.out.println("String to int: "+stringToInt);
        double stringToDouble = Double.parseDouble(intToString);
        System.out.println("String to double: "+stringToDouble);
        boolean stringToBoolean = Boolean.parseBoolean(intToString);
        System.out.println("String to boolean: "+stringToBoolean);
        System.out.println("String to byte: "+Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));

        System.out.println();
        System.out.println("3. Array Conversion");
        System.out.println("Array to int: " + arrayToInt(nums));
        System.out.println("int to Array: " + Arrays.toString(intToArray(123)));
        String result = arrayToString(nums);
        System.out.println("Array to String: " + arrayToString(nums));
        int[] array = stringToArray(result);
        System.out.println("String to Array: " + Arrays.toString(array));
        Integer[] integers= Arrays.stream(nums).boxed().toArray(Integer[]::new);
        System.out.println("int[] to Integer[]: " + Arrays.toString(integers));
        int[] ints=Arrays.stream(integers).mapToInt(i->i).toArray();
        System.out.println("Integer[] to int[]: " + Arrays.toString(ints));

        System.out.println();
        System.out.println("3. Character and Char Conversion");
        char[] charArray = stringToCharArray(result);
        System.out.println("String to Char Array: " + Arrays.toString(charArray));
        String charArrayToString = String.valueOf(charArray);
        System.out.println("Char Array to String: " + charArrayToString);
        String charToString = Character.toString(charValue);
        System.out.println("Char to String: " + charToString);
        char stringToChar = str.charAt(0);
        System.out.println("String to Char: " + stringToChar);

        System.out.println();
        System.out.println("4. Collections Conversions");
        List<Integer> integerList = Arrays.asList(integers);
        System.out.println("Integer Array to List: " + integerList);
        Integer[] integerListArray=integerList.toArray(new Integer[integerList.size()]);
        System.out.println("List to Integer Array: " + Arrays.toString(integerListArray));
        Set<Integer> integerSet = new HashSet<>(integerList);
        System.out.println("List to integerSet: " + integerSet);
        List<Integer> integerList2 = new ArrayList<>(integerSet);
        System.out.println("IntegerSet to List : " + integerList2);

        System.out.println();
        System.out.println("6. Stream Conversions");
        Stream<Integer> stream = integerList.stream();
        System.out.println("List to stream: " + stream);
        System.out.println("Stream to List: " + stream.collect(Collectors.toList()));
        Stream<Integer> stream2 = Arrays.stream(Arrays.stream(nums).boxed().toArray(Integer[]::new));
        System.out.println("Array to Stream: " + stream2);

        System.out.println();
        System.out.println("7.Numeric Conversions");
        double d = (double) intValue;
        System.out.println("int to Double: " + d);
        float f = (float) intValue;
        System.out.println("int to float: " + f);
        System.out.println("Double to int: " + (int) d);
        System.out.println("float to double: " + (double) f);

    }

    //array to int converter
    public static int arrayToInt(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result = (result*10) + nums[i];
        return result;
    }

    //int to array converter
    public static int[] intToArray(int num) {
        String numStr = String.valueOf(num);
        int[] numArr = new int[numStr.length()];
        for (int i = 0; i < numArr.length; i++)
            numArr[i] = Character.getNumericValue(numStr.charAt(i));
        return numArr;
    }

    //array to string converter
    public static String arrayToString(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums)
            sb.append(num);
        return sb.toString();
    }

    //array to string converter
    public static int[] stringToArray(String num) {
        int[] numArr = new int[num.length()];
        for (int i = 0; i < numArr.length; i++)
            numArr[i] = Character.getNumericValue(num.charAt(i));
       // Arrays.stream(num.split("")).mapToInt(Integer::parseInt).toArray();
        return numArr;
    }

    public static char[] stringToCharArray(String str) {
        return str.toCharArray();
    }

}
