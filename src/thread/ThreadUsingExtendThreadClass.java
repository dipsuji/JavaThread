package thread;

/**
 *
 Java Thread Example by extending Thread class
 to create a thread is to create a new class that extends Thread,
 then override the run() method and then to create an instance of that class.
 The run() method is what is executed by the thread after you call start().
 class ThreadUsingExtendThreadClass extends ThreadUsingRunnable, extends Thread { can not do this because can not inherit two class in java
 thats why we use runnable to make this class thread
 class ThreadUsingExtendThreadClass extends ThreadUsingRunnable implements Runnable {
 */
class ThreadUsingExtendThreadClass extends Thread {
    //    override the run() method
    //    Inside run( ), we  define the code that constitutes the new thread
    @Override
    public void run() {
        System.out.println("My thread Class ThreadUsingExtendThreadClass running ...");
    }

    public static void main(String args[]) {
//        create an instance of that class.
        ThreadUsingExtendThreadClass obj = new ThreadUsingExtendThreadClass();
        obj.start();
    }
}


