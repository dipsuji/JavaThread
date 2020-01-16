package thread;

/**
 * Java Thread Example by implementing Runnable interface
 * to create a thread is to create a class that implements the Runnable interface.
 * To implement Runnable interface, a class need only implement a single method called run( ).
 */
public class ThreadUsingRunnable implements Runnable {
    // overrides the run() method available in the Thread class.
    public void run() {
        System.out.println("My Class ThreadUsingRunnable running ...");
    }

    public static void main(String args[]) {
        // create an instance of that class.
        ThreadUsingRunnable obj = new ThreadUsingRunnable();

        Thread t1 = new Thread(obj);
//        pass an instance of MyClass to a Thread in its constructor
//          Thread t2 = new Thread(new create_thread_using_runnable());
        t1.start();
    }
}