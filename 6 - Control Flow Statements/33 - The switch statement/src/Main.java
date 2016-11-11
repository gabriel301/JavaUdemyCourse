/**
 * Created by g.ferreira.oliveira on 11/11/2016.
 */
public class Main {
    public static  void main(String[] args) {
//        int value =1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 1;
        //The case value must be:
        /*
            byte or Byte
            short or Short
            char or Character
            int or Integer
            String
            enum Values
            The case values must be compile-time constant values, i.e., literals, enum constants or final constants
            of the same type of the variable tested by the switch statement.
            NOTE: boolean and long, and their associated wrapper classes are not supported by switch statements
         */
        //The default block is only executed if there is no matching case value for the switch statement, no matter the position
        //of the default block within the switch statement.
        switch (switchValue){
            default:
                System.out.println("Value was not 1 or 2");
                break;
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

        }


    }
}
