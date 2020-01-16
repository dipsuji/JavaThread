package multiThread;

// Main Class

/**
 * OUTPUT-
 * ManyTaskDoingThreadClass 14 is running Name of thread Thread-2
 * I am doing many task now......in Thread class run
 * ManyTaskDoingThreadClass 16 is running Name of thread Thread-4
 * I am doing many task now......in Thread class run
 * ManyTaskDoingThreadClass 15 is running Name of thread Thread-3
 * I am doing many task now......in Thread class run
 * ManyTaskDoingThreadClass 13 is running Name of thread Thread-1
 * I am doing many task now......in Thread class run
 * ManyTaskDoingThreadClass 12 is running Name of thread Thread-0
 * I am doing many task now......in Thread class run
 *
 */
public class MultipleThreadTaskExample {

    public static void main(String[] args) {
        // we define number of thread
        for (int i = 0; i < 5; i++) {
            //  making  an object of our new class ManyTaskDoingThreadClass
            ManyTaskDoingThreadClass object = new ManyTaskDoingThreadClass();
            // start the execution of a thread
            object.start();
        }
    }
}