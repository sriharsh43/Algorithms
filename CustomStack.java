public class CustomStack {
    protected int[] data;
    private static final int default_size = 10;
    int ptr = -1;

    public CustomStack(){
        this(default_size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item) {
        if (isFull()){
            System.out.println("Stack is full..!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }
        return data[ptr--]; //returns the popped element
    }
    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from empty stack");

        }
        return data[ptr]; //Prints the current element
    }

   public boolean isFull() {
        return ptr == data.length-1; // ptr is at last index
    }
    public boolean isEmpty() {
        return ptr == -1; //Ptr at -1 means start
    }



}
