//make a function to add 2 number and return the sum
import java.util.*;
public class functionB{
    public static int calcsum(int num1,int num2){//parameters or formal parameter
        int sum=num1+num2;
        System.out.println("sum is  :"+ sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calcsum(a, b);//argument and actual parameter
    }
}
