package may17OOPS;

public class Iphone15_child extends Iphone14_parents {
    public static void main(String[] args) throws Exception {

        Iphone15_child obj15 = new Iphone15_child();
        obj15.Call_using_phone();
        obj15.HD_Picture();

    }
    public void security_by_FingerPrint() {
        System.out.println("We can unlock using finger touch");
    }
    public void HD_Picture() {
        System.out.println("We can capture HD Picture");
    }
    public void Lock_by_doubleshake(){
        System.out.println("We can lock using double shake");

    }
}
