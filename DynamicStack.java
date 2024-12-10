public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            //Double the array
            int[] temp = new int[data.length];
            //Copy the previous data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data =temp;
        }
        //We know the array is not full now so insert
        return super.push(item);
    }
}
