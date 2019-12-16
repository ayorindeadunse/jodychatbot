/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.util;

/**
 *
 * @author ayorindeadunse
 */
import java.util.Timer;
import java.util.TimerTask;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.Multiplexor;

public class Heart
{
    class HeartBeat extends TimerTask
    {

        public void run()
        {
            Multiplexor.pulse();
        }

        HeartBeat()
        {
        }
    }


    private Heart()
    {
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public static void start()
    {
        int i = 0;
        try
        {
            i = 60000 / Integer.parseInt(Globals.getProperty("programd.heart.pulserate"));
        }
        catch(NumberFormatException numberformatexception) { }
        if(i > 0)
            self.startBeating(i);
    }

    private void startBeating(int i)
    {
        timer = new Timer();
        timer.schedule(new HeartBeat(), 0L, i);
    }

    private Timer timer;
    private static final Heart self = new Heart();

}

