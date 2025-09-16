class Odd implements Runnable {
    public void run(){
    int num = 1;
    while (num<=20) {
        System.out.println("odd number: " + num);
        num += 2;
        }
    }
}
class Even implements Runnable {
    public void run() {
        int num = 2;
        while (num<=20) {
            System.out.println("even number: " + num);
            num += 2;

        }
    }
}
public class Threads{
    public static void main(String[] args) {
        Thread odd = new Thread(new Odd());
        Thread even = new Thread(new Even());
        odd.start();
        even.start();
    }
}