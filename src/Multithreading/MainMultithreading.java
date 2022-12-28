package Multithreading;

public class MainMultithreading {
    public static void main(String[] args) throws InterruptedException {
        /*
        * multithreading = Process of executing multiple threads simultaneously
        *                  Helps maximum utilization of cPU
        *                  Threads are independent, they don't affect the execution of other threads.
        *                  An exception in one thread will not interrupt other threads.
        *                  Useful for serving multiple clients, multiplayer games, or other mutually independent tasks
        * */

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        // To execute one thread after another we can use the join method
        // thread1.join(); // If nos commented, threads execute simultaneously
        thread1.join(3000); // same but waits 3 seconds to start executing thread, after the other began
        thread2.start();
    }
}
