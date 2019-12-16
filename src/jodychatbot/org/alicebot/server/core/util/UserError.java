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
public class UserError extends Error
{

    public UserError(String s)
    {
        super(s);
    }

    public UserError(Exception exception1)
    {
        super("Developer did not describe exception.");
        exception = exception1;
    }

    public UserError(String s, Exception exception1)
    {
        super(s);
        exception = exception1;
    }

    public Exception getException()
    {
        return exception;
    }

    private Exception exception;
}

