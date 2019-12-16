/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.responder;

/**
 *
 * @author ayorindeadunse
 */
import java.io.File;
import java.util.HashMap;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.util.SuffixFilenameFilter;

// Referenced classes of package org.alicebot.server.core.responder:
//            AbstractMarkupResponder

public class FlashResponder extends AbstractMarkupResponder
{

    public FlashResponder(String s, String s1)
    {
        super(s);
        if(s1.equals(""))
        {
            parseTemplate(chatTemplatePath);
        } else
        {
            String s2 = (String)templates.get(s1);
            if(s2 != null)
                parseTemplate(s2);
            else
                parseTemplate(chatTemplatePath);
        }
    }

    private static final SuffixFilenameFilter flashFilenameFilter;
    private static HashMap templates;
    private static final String templatesDirectoryName;
    private static String chatTemplatePath;

    static 
    {
        flashFilenameFilter = new SuffixFilenameFilter(new String[] {
            ".flash", ".data"
        });
        templatesDirectoryName = Globals.getProperty("programd.responder.flash.template.directory", "templates" + File.separator + "flash");
        chatTemplatePath = templatesDirectoryName + File.separator + Globals.getProperty("programd.responder.flash.template.chat-default", "chat.flash");
        templates = AbstractMarkupResponder.registerTemplates(templatesDirectoryName, flashFilenameFilter);
    }
}

