package Daywise_assignments;

public class Challenge_prg {
    static void main(String[] args) {
        double balance=8000;
        double with_drawal=100;
        boolean Acc_active=false;
        boolean pin_valid=true;

                if(Acc_active && pin_valid){
                    System.out.println("u r successfully logged in");

                }
                else {
                    System.out.println("u r not successfully logged ");
                }
                      boolean valid= with_drawal>0 && balance<=8000;
                System.out.println(valid?"Withdraw":"Reject");

    }
}
