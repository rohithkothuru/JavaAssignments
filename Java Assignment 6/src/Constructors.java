class c2{
    public c2(int a){
        this('c');
    }
    c2(char c){
        System.out.println(c);
    }
}
public class Constructors {
    public static void main(String[] args) {
        c2 obj=new c2(10);
    }
}
