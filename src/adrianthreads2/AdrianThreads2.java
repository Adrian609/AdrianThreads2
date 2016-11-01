package adrianthreads2;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 * @author Arod6
 */
public class AdrianThreads2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Runs 3 Threads that print out \"ABC\" for 5 seconds");

        // A method to call all three Threads
        addThreadPools();

    }

    private static void addThreadPools() {

        // SChedule 3 Threads to execute
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(3);

        //thread0 prints "A" to wait 0 and repeat every 1 second
        eventPool.scheduleAtFixedRate(new printA(), 0, 1, SECONDS);
        //thread1 prints "B" to wait 0 and repeat every 1 second
        eventPool.scheduleAtFixedRate(new printB(), 0, 1, SECONDS);
        //thread2 prints "C" to wait 0 and repeat every 1 second
        eventPool.scheduleAtFixedRate(new printC(), 0, 1, SECONDS);

//        For Debugging
//        System.out.println("Number of active Threads: " + Thread.activeCount());
//        System.out.println("Number of active Threads: " + Thread.activeCount());
//
//        Thread[] listOfThreads = new Thread[Thread.activeCount()];
//        Thread.enumerate(listOfThreads);
//
//        for (Thread i : listOfThreads) {
//            System.out.println("Name: " + i.getName());
//        }
//        for (Thread i : listOfThreads) {
//            System.out.println("Priority: " + i.getPriority());
//        }
        // Run for Five Seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Interrupt Exception");
        }

        // print statment just for spacing
        System.out.println("");

        // For Debugging 
//        for (Thread i : listOfThreads) {
//            System.out.println("Name: " + i.getName());
//        }
        // Number or active Threads is 4, main is a thread and printA, prinntB and Print C
        System.out.println("Number of Active Threads: " + Thread.activeCount());

        // Shutdown Threads
        eventPool.shutdown();
    }
}
