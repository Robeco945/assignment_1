class Customer{
    static int number = 0;
    int id;

    public Customer(){
        synchronized (Customer.class){
        number += 1;
        id = number;
    }
    }

    public void reserve(int tickets){
        synchronized(Ticket.class) {
            int result = Ticket.seats - tickets;
            if (result >= 0) {
                Ticket.seats = result;
                System.out.print("Customer " + id + " purchased " + tickets + " tickets");
                System.out.println("(remains: " + Ticket.seats + " tickets)");
            } else {
                System.out.println("Customer " + id + " could not purchase " + tickets + " tickets");
            }
        }
    }
}
public class Ticket {
    public static int seats = 10;
    public static void main(String[] arg){
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        Customer c4 = new Customer();

        Thread t1 = new Thread(() -> c1.reserve(2));
        Thread t2 = new Thread(() -> c2.reserve(6));
        Thread t3 = new Thread(() -> c3.reserve(3));
        Thread t4 = new Thread(() -> c4.reserve(2));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
