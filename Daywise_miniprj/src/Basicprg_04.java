public class Basicprg_04 {
    public static void main(String[] args){
        int num=50;
        boolean is_num_3= num % 3 ==0;
        boolean is_num_5=num % 5 ==0;
        boolean is_num_div_both =is_num_3 && is_num_5;
        System.out.println(is_num_div_both);
    }
}
