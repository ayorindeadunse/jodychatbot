/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.sql.pool;

/**
 *
 * @author ayorindeadunse
 */
class CleanUpThread extends Thread
{

    public CleanUpThread(ObjectPool objectpool, long l)
    {
        super("Database Pool Cleanup Thread");
        pool = objectpool;
        sleepTime = l;
    }

    public void run()
    {
        while(true) 
        {
            try
            {
                Thread.sleep(sleepTime);
            }
            catch(InterruptedException interruptedexception) { }
            pool.cleanUp();
        }
    }

    private ObjectPool pool;
    private long sleepTime;
}
