import java.util.Arrays;
public class conTest {
    private String s;
    private conTest(String s){
        this.s=s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        conTest arr[]=new conTest[5];
        for(int i=0;i<5;i++){
            arr[i]=new conTest("rohith");
        }
    }

}
