package may15;

import may12.JavaControlStatement;

public class I_Just_Call_Methods {

    public static void main(String[]args) throws Exception{
        This_is_Class_B obj= new This_is_Class_B();
        obj.mySchoolName();

        java_switch_statement obj_switch= new java_switch_statement();
        obj_switch.print_the_day( 5);

        JavaControlStatement obj_ctrl= new JavaControlStatement();
        obj_ctrl.print_1_to_100();
    }

}
