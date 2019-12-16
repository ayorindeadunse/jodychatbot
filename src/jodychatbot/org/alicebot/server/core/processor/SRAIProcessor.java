/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor;

import java.util.Iterator;

import jodychatbot.org.alicebot.server.core.ActiveMultiplexor;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.Graphmaster;
import jodychatbot.org.alicebot.server.core.Multiplexor;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.util.Trace;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;


/**
 *  Implements the &lt;srai/&gt; element.
 *
 *  @version    4.1.3
 *  @author     Jon Baer
 *  @author     Thomas Ringate, Pedro Colla
 */
public class SRAIProcessor extends AIMLProcessor
{
    public static final String label = "srai";


    /**
     *  Processes a &lt;srai/&gt; element.
     *
     *  First, all elements contained within a given &lt;srai/&gt;
     *  are evaluated, and the result is recursively fed as input
     *  to the pattern matching process. The result of such evaluation
     *  (which itself might be recursive) is returned as the result.
     *
     *  @see AIMLProcessor#process
     */
    public String process(int level, XMLNode tag, TemplateParser parser) throws AIMLProcessorException
    {
        String result = new String();
        
        if (tag.XMLType == XMLNode.TAG)
        {
            // Check for infinite loops.
            if (tag.XMLChild.size() == 1)
            {
                XMLNode sraiChild = (XMLNode)tag.XMLChild.get(0);

                if (sraiChild.XMLType == XMLNode.DATA)
                {
                    String sraiContent = sraiChild.XMLData;
                    //adjamir
                    /*Iterator inputsIterator = parser.getInputs().iterator();

                    while (inputsIterator.hasNext())
                    {
                        String input = (String)inputsIterator.next();

                        if (sraiContent.equalsIgnoreCase(input))
                        {
                            if (!sraiContent.equalsIgnoreCase(Globals.getInfiniteLoopInput()))
                            {
                                sraiChild.XMLData = Globals.getInfiniteLoopInput();
                                Log.userinfo("Infinite loop detected; substituting \"" + Globals.getInfiniteLoopInput() + "\".", Log.RUNTIME);
                            }
                            else
                            {
                                Log.userinfo("Unrecoverable infinite loop.", Log.RUNTIME);
                                return EMPTY_STRING;
                            }
                        }
                    }
                    */
                    parser.addInput(sraiContent);
                }
            }
            if (Globals.showMatchTrace())
            {
                Trace.userinfo("Symbolic Reduction:");
            }
            parser.push();
            result = Multiplexor.getInternalResponse(parser.evaluate(level++, tag.XMLChild),
                                                                       parser.getUserID(), parser.getBotID(),
                                                                       parser);
            parser.pop();
            return result;
        }
        else
        {
            throw new AIMLProcessorException("<srai></srai> must have content!");
        }
    }
}
