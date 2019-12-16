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
import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilenameFilter
    implements FilenameFilter
{

    public SuffixFilenameFilter(String as[])
    {
        SUFFIXES = as;
    }

    public boolean accept(File file, String s)
    {
        if(s == null)
            return false;
        if(s.length() == 0)
            return false;
        for(int i = SUFFIXES.length; --i >= 0;)
            if(s.endsWith(SUFFIXES[i]))
                return true;

        return false;
    }

    private static String SUFFIXES[];
}

