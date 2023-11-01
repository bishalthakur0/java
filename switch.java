import java.util.*;
public class switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int buttom=sc.nextInt();
        switch(buttom){
            case 1: System.out.println("Hello");
            break;
            case 2:System.out.println("Namesta");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("invalid buttom");
        }
    }
    
}
