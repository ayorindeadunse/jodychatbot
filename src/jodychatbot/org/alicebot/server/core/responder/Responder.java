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
public interface Responder {
    public abstract String preprocess(String s, String s1);

    public abstract void log(String s, String s1, String s2, String s3, String s4);

    public abstract String append(String s, String s1, String s2);

    public abstract String postprocess(String s);   
}
