import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */


    public static void main(String[] args) {


        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What grade level are you in? (9, 10, 11, 12)"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had?"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("About how much money do you have?"));


        if(gradeLevel >= 11){

            if(discipline >= 1){
                System.out.println("you cant go to prom sorry");
            }else{
                if(money >= 40){
                    System.out.println("you can get a prom ticket");
                }else{
                    System.out.println("You cant buy go to prom");
                }
            }
        }else{
            System.out.println("you cant go to prom sorry");
        }
    }
}
