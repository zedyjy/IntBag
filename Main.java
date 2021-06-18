package CS102.Lab01;
import java.util.Scanner;
public class Main {
    
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        IntBag bag = new IntBag();
        int option;
        
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(2);
        bag.add(2);
        bag.add(2);
        bag.add(2);
        bag.add(2);
        //bag.remove(1);
        int i = 0;
        while(i<100){
            bag.add(1);
            i++;
        }
        
        System.out.println(bag);

        
        /*
        do{
        System.out.print("1.	Create a new empty collection(any previous values are lost!)\n");
        System.out.print("2.	Read a set of positive values into the collection\n");
        System.out.print("3.	Print the collection of values.\n");
        System.out.print("4.	Add a value to the collection of values at a specified location\n");
        System.out.print("5.	Remove the value at a specified location from the collection of values\n");
        System.out.print("6.	Remove all instances of a value within the collection.\n");
        System.out.print("7.	Quit the program.\n");
        System.out.println( "\nPlease enter an option out of 1,2,3,4,5,6,7");
        option = input.nextInt();
        
        if(option == 1){
            bag.removeAll();
            System.out.println(bag);
        }
        else if(option == 2){
            for(int i = 0; i < bag.size(); i++){
                if(bag.value(i) > 0){
                System.out.println(bag.value(i));
                }
            }
        }
        else if (option == 3){
            System.out.println(bag);
        }
        else if (option == 4){
            System.out.println("Please enter a number to be added");
            int number = input.nextInt();
            System.out.println("Please enter index for number to be added");
            int index = input.nextInt();
            bag.addAtCertain(index,number);
            System.out.println(bag);
        }
        else if (option == 5){
            System.out.println("Please enter the index you want to remove.");
            int toRemove = input.nextInt();
            bag.remove(toRemove);
        }
        else if(option == 6){
            System.out.println("Please enter the number you want to remove.");
            int toRemove = input.nextInt();
            bag.remove(toRemove);
            System.out.println(bag);
        }
        else if (option == 7){
            System.out.println("See you next time!");
        }
    }while(option != 7);*/
        input.close();
    }
}
