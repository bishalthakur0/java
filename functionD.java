import java.util.*;
public class functionD {
    public static int mul(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int mul=mul(a, b);
            System.out.println(mul);
        }
    }
    
    

