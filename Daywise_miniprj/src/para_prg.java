public class para_prg {
    static void msg(String name){
        System.out.println("Hello"+name);
    }
    static int mul(int x,int y ){
       return x*y;
    }

    static void main(String[] args ){
        msg("Nafisha");
        msg("Zaina");
        int l=30;
        int w=3;
        int value=mul(l,w);
        System.out.println(value);
    }
}
