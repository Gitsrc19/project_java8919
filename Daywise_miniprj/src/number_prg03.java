import java.util.Scanner;

public class number_prg03 {
    public static void main(String[] args){
        System.out.println("Enter the integer value");
        Scanner obj1 = new Scanner(System.in);
        int num=obj1.nextInt();
        if(num>0)
        {
            System.out.println("+ve number");

        }else if(num==0){
            System.out.println("0 value");
        }else{
            System.out.println("-ve integer");
        }
    }
}
