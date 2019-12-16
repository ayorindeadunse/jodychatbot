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
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap
{

    public LRUCache(int i)
    {
        maxEntries = i;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > maxEntries;
    }

    private static int maxEntries;
}

