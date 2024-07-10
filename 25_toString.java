// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");\
        Scanner sc = new Scanner(System.in);
        
        String[] str= new String[4];
        for(int i =0; i<str.length; i++){
            str[i]= sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
