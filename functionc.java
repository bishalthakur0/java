import java.util.*;
public class functionc {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);
    }
    public static void main(String[] args){
        swap(3, 10); 
    }
    
}
