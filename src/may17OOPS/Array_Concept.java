package may17OOPS;

public class Array_Concept {
    int Roll = 1;
    public String name = "Raja";
    String[] studentsName;

    //datatype[] arrayname;
    public static void main(String[] args) {
        Array_Concept obj = new Array_Concept();
        obj.I_am_Learning_an_Array( 5);

    }

    public void I_am_Learning_an_Array(int num) {
        studentsName = new String[num];

        // studentsName[0]="Nilu";
        // studentsName[1]="Mithun";
        //studentsName[2]="Harsha";
        //studentsName[3]="Ashu";
        //studentsName[4]="Chaitanya";

        for (int a = 0; a < studentsName.length; a++) {
            studentsName[a] = "StudentName_" + a;
        }
        for (int i = 0; i < studentsName.length; i++) {


            System.out.println("The Student Name is ==>" + studentsName[3]);
        }
    }
}