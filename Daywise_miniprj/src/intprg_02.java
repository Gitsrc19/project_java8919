public class intprg_02 {
    public static void main(String[] args){
        int age=17;
        double income = 60000;
        boolean Eligible =age>=18 && income>=25000;
        System.out.println(Eligible? "Eligible for loan":"not Eligible");
    }
}
