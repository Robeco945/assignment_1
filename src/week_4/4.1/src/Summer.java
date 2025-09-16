public class Summer extends Thread{
    int[] array;
    int start, end, sum = 0;

    Summer(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }
    public void run(){
        for (int i = start; i < end; i++){
            sum += array[i];
        }
    }
    public int getSum(){
        return sum;
    }
}
