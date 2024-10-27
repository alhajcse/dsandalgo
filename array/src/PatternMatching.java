public class PatternMatching {
    public static void main(String[] args) {


        //Full pyramid
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Right haf pyramid
        int rn=3;
        for(int i=0;i<rn;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Left haf pyramid
        int ln=3;
        for(int i=0;i<ln;i++){
            for(int j=0;j<ln;j++){
                int f=ln-i-1;
                if(f<=j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //Full pyramid
        int fn=3;
        for(int i=0;i<fn;i++){
            for(int j=0;j<fn;j++){


                int f=ln-i-1;
                if(f<=j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
