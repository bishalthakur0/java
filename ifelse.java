import java.util.*;
public class ifelse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");

        }else{
            if(a>b){
                System.out.println("It is greater");
            }else{
                System.out.println("It is lesser");
            }
        }
    }
}