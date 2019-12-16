/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.Interpreter;
import jodychatbot.org.alicebot.server.core.interpreter.ActiveJavaScriptInterpreter;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class JavaScriptProcessor extends AIMLProcessor
{

    public JavaScriptProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(!Globals.jsAccessAllowed())
        {
            Log.userinfo("Use of <javascript> prohibited!", Log.INTERPRETER);
            return "";
        }
        if(xmlnode.XMLType == 0)
        {
            Log.devinfo("Calling JavaScript interpreter " + Globals.javaScriptInterpreter(), Log.INTERPRETER);
            return ActiveJavaScriptInterpreter.getInstance().evaluate(templateparser.evaluate(i++, xmlnode.XMLChild));
        } else
        {
            throw new AIMLProcessorException("<javascript></javascript> must have content!");
        }
    }

    public static final String label = "javascript";
}
