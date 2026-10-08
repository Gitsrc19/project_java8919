package Daywise_class_notes;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        System.out.println("please Enter the factorial number:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int fact=1;
        for(int i=num;i>=2;i--)
            fact=fact*i;
        System.out.println("Factorial value"+fact);


    }
}
