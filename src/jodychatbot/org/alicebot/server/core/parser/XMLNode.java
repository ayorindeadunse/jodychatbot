/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.parser;

/**
 *
 * @author ayorindeadunse
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class XMLNode
{

    XMLNode()
    {
        XMLType = 0;
        XMLData = "";
        XMLAttr = "";
        XMLChild = null;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(XMLData);
        stringbuffer.append(XMLAttr);
        if(XMLChild != null)
        {
            for(ListIterator listiterator = XMLChild.listIterator(); listiterator.hasNext(); stringbuffer.append(listiterator.next().toString()));
        }
        return stringbuffer.toString();
    }

    public static final int TAG = 0;
    public static final int EMPTY = 1;
    public static final int DATA = 2;
    public static final int CDATA = 3;
    public static final int COMMENT = 4;
    public static final int ENDTAG = 5;
    public int XMLType;
    public String XMLData;
    public String XMLAttr;
    public LinkedList XMLChild;
    private static final String EMPTY_STRING = "";
}

