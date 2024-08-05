    public class Patterns {
        public static void main(String[] args) {
    
    // 1.  *****
    //     *****
    //     *****
    //     *****
    //     *****
    // pattern1(5);
    
    pattern3(5);
    
        }
        static void pattern1(int n){
            for(int row=1;row<=n;row++){
                for(int col=1;col<=n;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    // 2.  *
    //     **
    //     ***
    //     ****
    //     *****
    // pattern2(5);
    
        static void pattern2(int n){
            for(int row=1;row<=n;row++){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

           
    // 3.  *****
    //     ****
    //     ***
    //     **
    //     *
        static void pattern3(int n){
            for(int row=1;row<=n;row++){
                for(int col=n;col>=row;col--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        
    } 