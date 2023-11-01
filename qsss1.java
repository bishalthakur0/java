//fuction for average of two numbers
import java.util.*;
public class qsss1 {
    public static int averagesum(int a,int b,int c){
        int A=a+b+c;
        int Average=A/3;
        System.out.println(Average);
        return Average;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averagesum(a, b, c);

   
    }
    }
    

