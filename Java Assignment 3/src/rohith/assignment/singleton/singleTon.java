package rohith.assignment.singleton;

public class singleTon {
    private String s;
    public static singleTon initialize(String val,singleTon obj){
        if((obj instanceof singleTon)){
            obj.s=val;
            return obj;
        }
        singleTon st = new singleTon();
        st.s=val;
        return st;
    }
    public void PrintString(){
        System.out.println(s);
    }
}
