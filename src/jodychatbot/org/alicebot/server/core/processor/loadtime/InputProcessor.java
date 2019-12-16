/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor.loadtime;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException, SubstitutionsProcessor

public class InputProcessor extends StartupElementProcessor
{

    public InputProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException
    {
        SubstitutionsProcessor.addSubstitutions(0, xmlnode, startupfileparser);
        return "";
    }

    public static final String label = "input";
}