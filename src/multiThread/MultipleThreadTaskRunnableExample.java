package multiThread;

/**
 * OUTPUT-
 * Running another .............................
 * ManyTaskDoingRunnableClass 14 is running, Name of this thread Name 2
 * I am doing much work in background runnable
 * ManyTaskDoingRunnableClass 13 is running, Name of this thread Name 1
 * I am doing much work in background runnable
 * ManyTaskDoingRunnableClass 16 is running, Name of this thread Name 4
 * I am doing much work in background runnable
 * ManyTaskDoingRunnableClass 15 is running, Name of this thread Name 3
 * I am doing much work in background runnable
 * ManyTaskDoingRunnableClass 12 is running, Name of this thread Name 0
 * I am doing much work in background runnable
 */
public class MultipleThreadTaskRunnableExample {

    public static void main(String[] args) {
        System.out.println("Running another .............................");
        for (int i = 0; i < 5; i++) {
//            can not make directly object of this class bcz this class is just implementing runnable interface
//            ManyTaskDoingRunnableClass obj = new ManyTaskDoingRunnableClass();
            // start the execution of a thread
//            obj.start();
//            making  an object of our new class ManyTaskDoingRunnableClass
            Thread object = new Thread(new ManyTaskDoingRunnableClass(), "Name "+i);
            object.start();
        }
    }
}