package Daywise_assignments;

public class Discount_prg {

    public static void main(String[] args)
    {
        double total = 2500;
        boolean vip = true;
        double discount = vip ? total * 0.10 : 0;
        double payable = total - discount;
        System.out.println(payable);
    }

}
