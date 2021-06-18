package CS102.Lab01;

public class Fibonacci {    
    private static IntBag bag = new IntBag();
    
    public static void numbers(){
        int temp;
        int pos = 0;
        while (pos < 41){
        temp = bag.value(pos) + bag.value(pos+1);
        bag.add(temp);
        pos++;
        }
    }
    
    public static void main(String [] args){
        bag.add(0);
        bag.add(1);
        numbers();
        System.out.println(bag);
    }
}
