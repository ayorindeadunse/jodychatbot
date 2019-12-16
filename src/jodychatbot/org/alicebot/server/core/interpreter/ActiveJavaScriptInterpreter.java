/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayorindeadunse
 */
package jodychatbot.org.alicebot.server.core.interpreter;

import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.Interpreter;
import jodychatbot.org.alicebot.server.core.util.DeveloperError;

public abstract class ActiveJavaScriptInterpreter
    implements Interpreter
{

    private ActiveJavaScriptInterpreter()
    {
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public static Interpreter getInstance()
    {
        return interpreter;
    }

    private static Interpreter interpreter;

    static 
    {
        try
        {
            interpreter = (Interpreter)Class.forName(Globals.javaScriptInterpreter()).newInstance();
        }
        catch(Exception exception)
        {
            throw new DeveloperError(exception);
        }
    }
}

