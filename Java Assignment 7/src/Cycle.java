
class Cycle {
    public Cycle() {
        System.out.println("This is Cycle");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("I balance with one Wheel");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("I balance with Two wheels");
    }
}
class Tricycle extends Cycle{
}
 class MainCycle{
    public static void main(String[] args) {
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Cycle arr[]=new Cycle[3];

        arr[0]=(Cycle)unicycle;
        arr[1]=(Cycle)bicycle;
        arr[2]=(Cycle)tricycle;

        unicycle.balance();
        bicycle.balance();

    }
}