import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        int cores = Runtime.getRuntime().availableProcessors();
        Summer[] workers = new Summer[cores];
        int chunk = arr.length / cores;

        for (int i = 0; i < cores; i++) {
            int start = i * chunk;
            int end = (i == cores - 1) ? arr.length : (i + 1) * chunk;
            workers[i] = new Summer(arr, start, end);
            workers[i].start();
        }

        int total = 0;
        for (Summer worker : workers) {
            worker.join();
            total += worker.getSum();
        }
        System.out.println("Total sum: " + total);
        System.out.println("Total cores: " + cores);
    }
}
