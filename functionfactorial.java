import java.util.*;
public class functionfactorial {
    public static void Printfactorial(int n){
        if(n<1){
            System.out.println("Invalid number");
            return ;
        }
        int Factorial=1;
        for(int i=n;i>=1;i--){
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
        return ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Printfactorial(n);
    }
    
}
