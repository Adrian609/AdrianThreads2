/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrianthreads2;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Arod6
 */
public class printA implements Runnable {

    // prevents the run method from bring accesable
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.print("A");
        lock.unlock();
    }

}
