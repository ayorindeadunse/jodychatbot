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
public class StringTriple
{

    public StringTriple(String s, String s1, String s2)
    {
        first = s;
        second = s1;
        third = s2;
    }

    public String getFirst()
    {
        return first;
    }

    public String getSecond()
    {
        return second;
    }

    public String getThird()
    {
        return third;
    }

    public void setFirst(String s)
    {
        first = s;
    }

    public void setSecond(String s)
    {
        second = s;
    }

    public void setThird(String s)
    {
        third = s;
    }

    public boolean equals(Object obj)
    {
        StringTriple stringtriple;
        try
        {
            stringtriple = (StringTriple)obj;
        }
        catch(ClassCastException classcastexception)
        {
            return false;
        }
        return stringtriple.getFirst().equals(first) & stringtriple.getSecond().equals(second) & stringtriple.getThird().equals(third);
    }

    private String first;
    private String second;
    private String third;
}

