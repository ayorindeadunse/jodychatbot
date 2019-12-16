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
public class DeveloperError extends Error
{

    public DeveloperError(String s)
    {
        super(s);
    }

    public DeveloperError(Throwable throwable1)
    {
        super("Developer did not describe exception.");
        throwable = throwable1;
    }

    public DeveloperError(String s, Throwable throwable1)
    {
        super(s);
        throwable = throwable1;
    }

    public Throwable getEmbedded()
    {
        return throwable;
    }

    private Throwable throwable;
}

