//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //PERIMATIVES
        char c = 'A'; //create variable of a thype charachter and assign value A
        int quantity = 12; //an even dozen
        double price = 1.23; // double precision floating point decimal

        //non-primitives (complex/objects/collections)
        String name = "Bemi";
        String last = "Hai";
        Integer age = 20; //wrapped primitive is called a boxed primitive;
        Double weight = 242.12;

        //Expressions are like equations that calculate a result to use.
        double total = quantity * price; // cal total multiple qty times price
        String full = last + "," + name;// + Concation operator chains together
        System.out.print(total);
        System.out.println(full);

        double third = 1.0 / 3.0;//demo floating point error (rounding)
        System.out.print(third);

        double pi = 3.1415926535;//float  data type is too small so use double!
        System.out.print(pi);

        int cost_in_pennies = 33;
        double total_cost = (double)cost_in_pennies / 3;
        System.out.print(total_cost);



        }// end main
    }//end Main class
