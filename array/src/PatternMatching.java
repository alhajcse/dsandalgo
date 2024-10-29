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




        System.out.println();


        //Inverted right half pyramid
        int invt=3;
        for(int i=0;i<invt;i++){
            for(int j=0;j<invt-i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }



        //Left haf pyramid
        int invLeft=9;
        for(int i=0;i<invLeft;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<invLeft-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }



        //Full pyramid
        int fn=3;
        for(int i=0;i<fn;i++){

            for(int j=0;j<invLeft-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }



        //Invert Full pyramid
        int invfn=3;
        for(int i=0;i<invfn;i++){

            //Space print
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //Star Print
            for(int k=0;k<invfn-i;k++){
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }



        //Invert Full pyramid
        int rhombus=4;
        for(int i=0;i<rhombus;i++){

            //Space print
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //Star Print
            for(int k=0;k<rhombus;k++){
                System.out.print("*");
            }
            System.out.println();
        }


        int d=3;
        for(int i=0;i<2*d-1;i++){
             int com=0;
             if(com>i){
                 com=2*(d-i)-1;
             }else {
                 com=com+i;
             }

            //Space print
            for(int j=0;j<com;j++){
                System.out.print(" ");
            }

            //Star Print
            for(int k=0;k<com;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();



        //Full pyramid
        int fd=9;
        for(int i=0;i<fd;i++){

            for(int j=0;j<fd-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();

        }

        fd=fd-1;
        for(int i=0;i<fd;i++){
            System.out.print("  ");
            //Space print
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //Star Print
            for(int k=0;k<fd-i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }







        //Full pyramid
        int invfd=3;
        for(int i=0;i<invfd;i++){
            System.out.print("  ");
            //Space print
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //Star Print
            for(int k=0;k<invfd-i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1;i<invfd;i++){

            System.out.print(" ");

            for(int j=0;j<invfd-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();

        }




        System.out.println();

        n=5+1;
        for(int i=0;i<n;i++){
            //Space print
            for(int j=0;j<n;j++){

                if(j==0 || j==n-1 || i==0 || i==n-1){
                    System.out.print("* ");
                }else System.out.print("  ");

            }
            System.out.println();
        }



        //Full pyramid
        n=3;
        n=n+5;
        for(int i=0;i<=n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                if (k==0||k==i-1 || i==0 || i==n){
                    System.out.print("* ");
                }else System.out.print("  ");
            }

            System.out.println();
        }

        System.out.println();
        n=3;
        n=n+5;
        for(int i=0;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                if (k==0||k==n-i-1 || i==0 || i==n){
                    System.out.print("* ");
                }else System.out.print("  ");
            }

            System.out.println();
        }







        n=3;
        n=n+5;
        for(int i=0;i<=n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                if (k==0||k==i-1 || i==0){
                    System.out.print("* ");
                }else System.out.print("  ");
            }

            System.out.println();
        }
        n=n-1;
        for(int i=0;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                if (k==0||k==n-i-1 || i==n){
                    System.out.print(" *");
                }else System.out.print("  ");
            }

            System.out.println();
        }



        System.out.println();

        n=3;
        n=n+5;
        for(int i=0;i<=n;i++){

            for(int j=0;j<n;j++){
                if(j==i){
                    System.out.print("*");
                }else System.out.print("  ");
            }
            System.out.println();
        }


        n=3;
        n=n+5;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(j==i){
                    System.out.print("*");
                }else System.out.print("  ");
            }
            System.out.println();
        }



        n=3;
        n=n+5;
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }

            System.out.print("*");
            System.out.println();
        }


        System.out.println();


        n=1;
        n=n+5;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(j==i || j==n-i-1){
                    System.out.print("* ");
                }else System.out.print("  ");

            }

            System.out.println();
        }


        System.out.println();

        n=1;
        n=n+5;
        for(int i=0;i<n;i++){
            System.out.print(" ");
            for(int j=0;j<i;j++){
               System.out.print(" ");
            }

           for(int k=0;k<=n-i;k++){
               if (k==0||  k==n-i-1){
                   System.out.print("* ");
               }else System.out.print("  ");

           }

            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){

                if(k==0 ||  k==i){
                    System.out.print("* ");
                }else System.out.print("  ");


            }

            System.out.println();
        }


        System.out.println();
        n=2;
        n=n+5;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(j==n/2 || i==n/2){
                    System.out.print(" +");
                }else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
