
public interface Rodent {
    void getMyLooks();
    void getRunSpeed();
}


class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Hii , Iam Mouse from Rodent Family");
    }

    @Override
    public void getMyLooks() {
        System.out.println("I have a long tail and face");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run Faster than all Rodents");
    }
}


class Gerbil implements Rodent {
    public Gerbil() {
        System.out.println("Hii , Iam Gerbil from Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run faster than Hamster but slower than Mouse");
    }

    @Override
    public void getMyLooks(){
        System.out.println("I have long tails, smallish ears, and long, flat foreheads/noses");
    }
}


class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hii , Iam Hamster from Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I don't run very fast ");
    }
    @Override
    public void getMyLooks() {
        System.out.println(" I have short tails or no tails, and much rounder, stouter faces");

    }
}

class Rodents {
    public static void main(String[] args) {
        Rodent []rodents=new Rodent[3];
        rodents[0]=new Gerbil();
        rodents[0].getMyLooks();
        rodents[0].getRunSpeed();
        rodents[1]=new Hamster();
        rodents[1].getMyLooks();
        rodents[1].getRunSpeed();
        rodents[2]=new Mouse();
        rodents[2].getMyLooks();
        rodents[2].getRunSpeed();
    }
}
