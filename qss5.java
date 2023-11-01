import java.util.*;
public class qss5 {
    public static void election(int n){
        if(n>18){
            System.out.println("he is eligible for vote");
        }else if(n<18){
            System.out.println("he is not an adult so cant vote");
        }else if(1>n){
            System.out.println("invalid age");
        }
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            election(n);
        }
    }
    

