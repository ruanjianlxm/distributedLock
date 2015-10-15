package com.jason.distributedlock;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;

import com.jason.pandaLock.core.exception.ConnectException;
import com.jason.pandaLock.core.exception.PandaLockException;
import com.jason.pandaLock.core.serverImpl.ZkPandaLock;

/**
 * Unit test for simple App.
 */
public class LockTest 
{
	public static void main(String[] args) throws IOException, KeeperException, InterruptedException, ConnectException, PandaLockException {
		//ZkPandaLock zkPandaLock = new ZkPandaLock();
		//zkPandaLock.connectZooKeeper("127.0.0.1:2181", "jason");
	/*	boolean tryLockResult = ZkPandaLock.tryLock();
		System.out.println("tryLockResult:"+tryLockResult);
		boolean releaseLockResult = ZkPandaLock.releaseLock();
		System.out.println("releaseLockResult:"+releaseLockResult);*/
		for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    try {
                    	ZkPandaLock zkPandaLock = new ZkPandaLock();
                    	zkPandaLock.connectZooKeeper("127.0.0.1:2181", "jason");
                    	zkPandaLock.lock();
                    	System.out.println(Thread.currentThread().getName()+"在做事，做完就释放锁");
                    	Thread.sleep(1000);
                    	System.out.println(Thread.currentThread().getName()+"我做完事情了");
                    	zkPandaLock.releaseLock();
                    	
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
	}
}
