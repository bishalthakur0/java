public class pattern13 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //secod part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
