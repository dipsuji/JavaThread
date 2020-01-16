package multiThread;

/**
 *  Multi Thread Example creation by implementing the Runnable Interface
 * create a thread is to create a class that implements the Runnable interface.
 * To implement Runnable interface, a class need only implement a single method called run( ).
 */
public class ManyTaskDoingRunnableClass implements Runnable {
    // overrides the run() method available in the Thread class.
    @Override
    public void run() {
        try {
            // for Display the thread when thread is running
            System.out.println("ManyTaskDoingRunnableClass " +
                    Thread.currentThread().getId() +
                    " is running, Name of this thread " + Thread.currentThread().getName());

            System.out.println("I am doing much work in background runnable ");

        } catch (Exception e) {
            // printing when exception
            System.out.println("Exception");
        }
    }
}

