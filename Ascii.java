import java.util.Scanner;

public class Ascii{
    public static void main(String[] args){
        char ch;
       Scanner sc=new Scanner(System.in);
        System.out.println("\n please enter any character value:");
         ch=sc.next().charAt(0);
        int asciiCode=ch;
        
        System.out.println("ascii value of"+ch+"is:"+asciiCode);
        
        sc.close();
    }
}



