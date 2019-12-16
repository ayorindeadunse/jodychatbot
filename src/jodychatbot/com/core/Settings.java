/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.com.core;

/**
 *
 * @author ayorindeadunse
 * @version = 1.0
 
 * To modify this file late for additional settings (other colours)
 
 
 
 */
public class Settings {
    public static int getTheme()
    {
        return THEME;
    }
    public static void setTheme(int inputTheme)
    {
        THEME = inputTheme;
    }
    private static int THEME = 1;
}
