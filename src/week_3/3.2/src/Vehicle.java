public interface Vehicle {
    default void start() {
        System.out.println("vehicle is starting");
    }

    default void stop() {
        System.out.println("vehicle is stopping");
    }

    String getInfo();
}
