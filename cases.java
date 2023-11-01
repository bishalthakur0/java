import java .util.*;
class cases{
    //length of string and stringbuffer
    String s="jain university";//string instalization
    StringBuffer sb1=new StringBuffer();//string buffer with default size but no input

    StringBuffer sb2=new StringBuffer("SETJU");//String buffer wth length
    StringBuffer sb3=new StringBuffer(50);// string buffer with capacity input
    void demo1()
    {
        System.out.println("Case1");
        System.out.println("with input,string length is:"+s.length());//string length
        System.out.println("Before input String buffer length is:"+sb1.length());//stringbuffer length
        System.out.println("with input string buffer length is:"+sb2.length());
        System.out.println("with capacity input,string buffer length is:"+sb3.length());
        System.out.println("Before input,stringbuffer length is:"+sb1.capacity());//stringbuffer capacity
        System.out.println("with input string buffer length is:"+sb2.capacity());
        System.out.println("with capacity input,string buffer length is :"+sb3.capacity());
    }

}