// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
public class ColFixed{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] arr={
        {1,2,3,4},
        {5,6},
        {7,8,9}
    };
    for(int row=0;row<arr.length;row++){
        for(int col=0;col < arr[row].length;col++){
        // int[row][col]= sc.nextInt();
        System.out.print(arr[row][col] + " ");
    }
    System.out.println();
    
}
}
}
