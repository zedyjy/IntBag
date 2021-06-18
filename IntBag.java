package CS102.Lab01;

public class IntBag {
    
    private static int [] bag;
    private static int current = 0;
    
    public IntBag(){
        bag = new int [4];
    }
    
    public void add( int num ){
        if(isFull()){
            int [] sizeDoubledBag = new int [bag.length*2];
            for(int a = 0; a < bag.length; a++ ){
                sizeDoubledBag [a] = bag [a];
            }
            bag = sizeDoubledBag;
        }
        bag[current]= num;
        bag[current+1] = -1;
        current++;
    }
    
    public void addAtCertain(int i, int num){
        if (num < 0){
            System.out.println("Please enter a non-negative value");
        }
        else{
            if(!isFull()){
                int temp, pos;
                temp = bag [i];
                for(int j = i; j < bag.length-1; j++){
                    pos = bag [j+1];
                    bag [i] = num;
                    bag [j+1] = temp;
                    temp = pos;
                }
            }
            else{
                int [] sizeDoubledBag = new int [bag.length*2];
                
                for(int a = 0; a < bag.length; a++ ){
                    sizeDoubledBag [a] = bag [a];
                }
                bag = sizeDoubledBag;
                
                int temp, pos;
                temp = bag [i];
                
                for(int j = i; j < bag.length-1; j++){
                    pos = bag [j+1];
                    bag [i] = num;
                    bag [j+1] = temp;
                    temp = pos;
                }
            }
        }
    }
    
    public boolean isFull(){
        boolean isFull = true;
        for(int s : bag) {
            if(s == 0) {
                isFull = false;
            }
        }
        return isFull;
    }
    
    public void remove (int toRemove){
        int [] copyBag = new int [bag.length];
        
        for (int i = 0; i < bag.length; i++){
            if( toRemove == bag[i] ){
                int pos = i;
                
                for(int a = 0; a < pos-1; a++){
                    copyBag [a] = bag [a];
                }
                
                for(int a = pos+1; a < bag.length; a++){
                    copyBag [a] = bag [a];
                }
                bag = copyBag;
            }
        }
    }
    
    public boolean test(int numToTest){
        for(int i = 0; i<bag.length; i++ ){
            if(bag[i] == numToTest){
                return true;
            }
        }
        return false;
    }
    
    public int size(){
        int size = 0;
        for(int i = 0; i< bag.length; i++){
            if (bag[i] != 0)
            size++;
        }
        return size;
    }
    
    public int value(int i){
        return bag[i]; 
    }
    
    public void removeAll(){
        for(int i = 0; i < bag.length; i++){
        bag[i]=0;
        }
    }
    
    public String toString(){
        String s = "";
        for(int i=0; i < bag.length; i++){
            if(bag [i] != 0){
            s += bag [i] + " ";
            }
        }
        return s;
    }
}