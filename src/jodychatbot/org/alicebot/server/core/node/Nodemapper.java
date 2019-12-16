/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.node;

/**
 *
 * @author ayorindeadunse
 */

import java.util.Set;

public interface Nodemapper
{

    public abstract Object put(String s, Object obj);

    public abstract Object get(String s);

    public abstract void remove(Object obj);

    public abstract Set keySet();

    public abstract boolean containsKey(String s);

    public abstract int size();

    public abstract void setParent(Nodemapper nodemapper);

    public abstract Nodemapper getParent();

    public abstract int getHeight();

    public abstract void setTop();
}
