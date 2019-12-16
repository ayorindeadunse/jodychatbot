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
import jodychatbot.org.alicebot.server.core.parser.GenericParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor:
//            ProcessorException

public abstract class Processor
{

    public Processor()
    {
    }

    public abstract String process(int i, XMLNode xmlnode, GenericParser genericparser)
        throws ProcessorException;

    public static final String label = null;
    protected static final String EMPTY_STRING = "";
    protected static final String NAME = "name";
    protected static final String VALUE = "value";
    protected static final String NAME_EQUALS = "name=";
    protected static final String VALUE_EQUALS = "value=";
    protected static final String ID = "id";
    protected static final String ENABLED = "enabled";

}
