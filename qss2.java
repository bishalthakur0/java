import java.util.*;
public class qss2 {
    public static int oddsum(int n){
        int sum=0;
        
        for(int i=0;i<=n;i++){
            if(n%2==0){
                System.out.println("not an odd number");
                return sum ;
            }
            if((i%2)==1){
            sum+=i;}
        }
            System.out.println(sum);
            return sum;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            oddsum(n);
        
        }
    }
    

