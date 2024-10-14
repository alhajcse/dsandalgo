public class GivenNumber {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,3};
        int count=0;
        int target=2;
        int n=7;

        for(int i=0;i<n;i++){
            if(target==arr[i]){
                count++;
            }
        }

        System.out.println(target+" "+count);


    }
}
