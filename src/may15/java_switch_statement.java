package may15;

public class java_switch_statement {

    public static void main(String[]args) throws Exception {
        java_switch_statement obj= new java_switch_statement();
        obj.print_the_day( 0);
    }
    public void print_the_day(int num){
        String dayString;

        switch(num){
            case 1:
                dayString= "Monday";
                break;
                case 2:
                dayString= "Tuesday";
                break;
                case 3:
                dayString= "Wednesday";
                break;
                case 4:
                dayString= "Thursday";
                break;
                case 5:
                dayString= "Friday";
                break;
                case 6:
                dayString= "Saturday";
                break;
                case 7:
                dayString= "Sunday";
                break;
            default:
                dayString= "Invalid Day";
                break;
        }
        System.out.println("The day is "+ dayString);

    }
}
