/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core;

import jodychatbot.org.alicebot.server.core.util.DeveloperError;

/**
 *
 * @author ayorindeadunse
 */
public class ActiveMultiplexor {
    
      private ActiveMultiplexor(String s)
    {
        try
        {
            multiplexor = (Multiplexor)Class.forName(s).newInstance();
        }
        catch(Exception exception)
        {
            throw new DeveloperError(exception);
        }
    }
    
        protected Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
        public static Multiplexor getInstance()
    {
        return multiplexor;
    }
        
    private static Multiplexor multiplexor;
    private static final ActiveMultiplexor myself = new ActiveMultiplexor(Globals.getProperty("programd.multiplexor", "jodychatbot.org.alicebot.server.core.FlatFileMultiplexor"));
}
