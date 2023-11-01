import java.util.*;
public class qsss3 {
    public static void greater(int a,int b){
        if(a<b){
            System.out.println("b is greater than a");
        }else{
            System.out.println("a is greater than b");
        }
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            greater(a, b);
        }
    }
    

