import java.util.*;
public class arrayinputoutput {
    public static void main(String[] args){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths
        System.out.println("physics:"+marks[0]);
        System.out.println("chemistry:"+marks[1]);
        System.out.println("maths:"+marks[2]);

    }
    
}
