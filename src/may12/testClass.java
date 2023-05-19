package may12;

public class testClass {
    private String applicationToken= null;

    public static void main(String[]args){
        testClass obj= new testClass();

        actionClass act= new actionClass(obj.applicationTokenNumber());
        System.out.println("The value of Global Token Number=="+act.global_Token_Number);

    }
    public String applicationTokenNumber(){
        return "AA8122345001";

    }
}
