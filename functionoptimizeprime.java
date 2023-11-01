import java.util.*;
public class functionoptimizeprime {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){//optimized solutiob
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primrrange(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        primrrange(12);
    

    }
    
    
}
