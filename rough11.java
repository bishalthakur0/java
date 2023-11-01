import java.lang.reflect.Constructor;

public class rough11{
    String name;
    int number;
    Constructor(){
        System.out.println("Default constructor");
    }
    Constructor(String default value){
        System.out.println("parameterized construction of name");
        name=default value;
    }
    Constructor(int number){
        System.out.println("parametrized construction for number");
        this number=number;
    }

    public static void main(String[] args){
        Constructor ob=new Constructor("custom value");
        System.out.println((ob.name));
        Constructor obj=new Constructor(1 2 5);
        System.out.println("obj.number");

    }
}