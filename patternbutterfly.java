import java.util.*;
public class patternbutterfly {
    public static void main(String[] args){
        int n=4;
        //first part 
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        //second part
            int space=2*(n-i);
            for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //third part
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
    
}