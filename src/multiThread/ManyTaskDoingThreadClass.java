package multiThread;

/**
 * assume this class is doing many things
 */
public class ManyTaskDoingThreadClass extends Thread {
    // overrides the run() method available in the Thread class.
    @Override
    public void run() {
        try {
            // for Display the thread when thread is running
            System.out.println("ManyTaskDoingThreadClass " +
                    Thread.currentThread().getId() +
                    " is running Name of thread "+this.getName());

            System.out.println("I am doing many task now......in Thread class run");

        } catch (Exception e) {
            //  print when exception
            System.out.println("Exception");
        }
    }
}
