package Threads;

public class MainThreads {
    public static void main(String[] args) throws InterruptedException {
        /*
        * thread = A thread of execution in a program (kind of like a virutal CPU)
        *          The JVM allows an application to have multiple threads running concurrently
        *          Each thread has a proirity.
        *          Threads with higher priority are executed in preference compared to threads with
        *          a lower priority
        *
        *          The Java Virtual Machine continues to execute threads until either of the following occurs
        * 1. The exit method of class Runtime has been called
        * 2. All user threads have died
        *
        * When a JVM starts up, there is a thread wich calls the main method
        * This thread is called "main"
        *
        * Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
        * JVM terminates itself when all thread (non-daemon threads) finish thei execution
        * */

        System.out.println(Thread.activeCount()); // See amount of active threads
        Thread.currentThread().setName("MAIN"); // Change Thread name
        System.out.println(Thread.currentThread().getName()); // Check name of current Thread
        Thread.currentThread().setPriority(10); // Change Thread priority 1 to 10.
        System.out.println(Thread.currentThread().getPriority()); // See priority of Thread
        // A higher number shows higher priority for this Thread. Numbers 1 to 10
        System.out.println(Thread.currentThread().isAlive()); // check if Thread is running

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");

        MyThread thread2 = new MyThread();
        thread2.start(); // starts our new thread

        System.out.println(thread2.isAlive());
        thread2.setName("2nd Thread");
        System.out.println(thread2.getName());
        thread2.setPriority(2);
        System.out.println(thread2.getPriority());

        // change thread2 to a daemon thread
        // thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
    }
}
