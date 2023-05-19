package AnkiLearning;

public class Printnumbers {
    public static void main(String[]args) {

        for (int a=1; a<=20;a++){
            if(isEvenNumber(a)){
                System.out.println(a+"- Ashu");
            }
            else {
                System.out.println(a+"- Taha");
            }
        }
    }

    private static boolean isEvenNumber(int number){
         number = (number%2);
         if(number ==0){
             return true;
         }
         else {
             return false;
         }

    }
}
