import java.util.*;
public class ifelseA {
    public static void main(String[] args){
        int age=20;
        if(age>20){
            System.out.println("Adult");
        }
        if(age>16 && age<21){
            System.out.println("Teenager");
            if(age>19){
                System.out.println("bang bang");
                if(age<20){
                    System.out.println("not allow");
                }
            }
        }
        else{
            System.out.println("Not adult");
        }
    }
    
}
