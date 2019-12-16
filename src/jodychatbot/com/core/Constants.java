/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.com.core;
import javax.swing.ImageIcon;

/**
 * Store constants of the chatbot.
 * Store the required constants of the program and provide functions 
 * to get access to the constants.
 * 
 * Examples of constants are program and author info, 
 * version information, dialog box messages, etc.
 * 
 * @author @ayorindeadunse [michaelayorindeolawale@gmail.com]
 * @version 1.0
 */
public class Constants {
    public static String getVersion() {
        return VERSION;
    }
    
    public static String getTitle() {
        return TITLE;
    }
    public static String getName() {
        return NAME;
    }
    public static ImageIcon getLogo() {
        return LOGO;
    }
    
    public static ImageIcon getIcon() {
        return ICON;
    }
    
    public static String getTooltipPaused() {
        return TOOLTIP_PAUSED;
    }
    
    public static String getTooltipDisplay() {
        return TOOLTIP_DISPLAY;
    }
    
    public static String getTooltipInput() {
        return TOOLTIP_INPUT;
    }
    
    public static String getTooltipEnterButton() {
        return TOOLTIP_ENTER_BUTTON;
    }
    
    public static String getDeveloper() {
        return DEVELOPER;
    }
    
    public static String getDeveloperEmail() {
        return DEVELOPER_EMAIL;
    }
    
    public static String getCopyrightYear() {
        return COPYRIGHT_YEAR;
    }
    
    public static String getCopyrightText() {
        return COPYRIGHT_TEXT;
    }
    
    public static String[] getCopyrightInfo() {
        return COPYRIGHT_INFO;
    }
    
    public static String getBuild() {
        return BUILD;
    }
    
    public static String[] getMessageAbout() {
        return MESSAGE_ABOUT;
    }
    
    public static String getWebsite() {
        return WEBSITE;
    }
    
    public static String[] getMessageCommands() {
        return MESSAGE_COMMANDS;
    }
    
    public static String[] getMessageCredits() {
        return MESSAGE_CREDITS;
    }
    
    public static String[] getMessageLicense() {
        return MESSAGE_LICENSE;
    }
    
    public static String[] getBotDetailsJody() {
        return BOT_DETAILS_JODY;
    }
    
    private static final String NAME = "Jody Chatbot";
    private static final String VERSION = "1.0";
    private static final String BUILD = "00";
    private static final String TITLE = NAME+" v"+VERSION;
    
    private static final String DEVELOPER = "Ayorinde Adunse";
    private static final String DEVELOPER_EMAIL = "michaelayorindeolawale@gmail.com";
    private static final String WEBSITE = "";
    private static final String COPYRIGHT_YEAR = "2019";
    private static final String COPYRIGHT_TEXT = "Copyright (C)" + COPYRIGHT_YEAR + " " + DEVELOPER + " [" + DEVELOPER_EMAIL + "]";
    
    private static final String TOOLTIP_PAUSED = "Program is paused. Unpause the program to resume the conversation.";
    private static final String TOOLTIP_DISPLAY = "On-going chat conversation.";
    private static final String TOOLTIP_INPUT = "Write your message and press Enter to send.";
    private static final String TOOLTIP_ENTER_BUTTON = "Press enter to send your message.";
    
    private static final ImageIcon LOGO = new ImageIcon(ClassLoader.getSystemResource("jodychatbot/com/core/icons/kutkutLogo.png"));
    private static final ImageIcon ICON = new ImageIcon(ClassLoader.getSystemResource("jodychatbot/com/core/icons/kutkutIcon.png"));
    
    public static final String COPYRIGHT_INFO[] ={
        TITLE,
        COPYRIGHT_TEXT,
        "All Rights Reserved.", 
        "This program is free software; you can redistribute it and/or", 
        "modify it under the terms of the GNU General Public License", 
        "as published by the Free Software Foundation; either version 2", 
        "of the License, or (at your option) any later version."   
    };
    
    private static final String MESSAGE_ABOUT[] = {
       NAME,
         "Version " + VERSION, " ", 
        COPYRIGHT_TEXT, 
        "All Rights Reserved", " ", 
        "Homepage: " + WEBSITE, " ", 
        "License: GNU GPLv2", " ", 
        "What's new in this version :-", 
        "1. Re-designed graphical interface", 
        "2. Theme chooser with three in-built themes", 
        "3. Better Pause feature", 
        "4. Jody Chatbot - Ayorinde's version of Kutkut Sally bot", " " 
    };
    
    private static final String MESSAGE_COMMANDS[] = {
          NAME, " ", 
        "These are the commands that can be passed as a message to the Kutkut's shell", 
        "and Kutkut will perform the associated operation.", 
        "Note: Shell commands start with forward slash \'/\' character.", " ", 
        "/help              -   prints this help", 
        "/exit              -   shuts down the bot server", 
        "/load filename     -   loads/reloads given filename for active bot", 
        "/unload filename   -   unloads given filename for active bot", 
        "/bots              -   lists loaded bots", 
        "/talkto botid      -   switches conversation to given bot", 
        "/who               -   prints the id of the current bot", 
        "/files             -   lists the files loaded by the current bot", 
        "/roll chatlog      -   rolls over chat log", 
        "/roll targets      -   rolls over saved targeting data", 
        "/commandables      -   lists available \"shell commandables\" (such as listeners)", " "
    };
    
    private static final String MESSAGE_CREDITS[] = {
        NAME, 
        "Jody Chatbot is a chatter bot program that can talk with you", 
        "like a human being using the artificial intelligence.", " ",
        "Jody chatbot",  
        "Jody Chatbot is a customized version of Kutkut chatbot, which in turn is a customized version Alice bot.", " ", 
        "Jody Chatbot was never possible without these wonderful software:", 
        "1. Charliebot: A chat program based on ANNA", 
        "2. ANNA: A chat program based on Program D", 
        "3. Program D: A chat program based on Alice bot", 
        "4. Alice: A wonderful AI chat program that uses AIML(Artificial Intelligence Markup Language)", " "
    };
    
    private static final String MESSAGE_LICENSE[] = {
        NAME, 
        COPYRIGHT_TEXT, 
        "All Rights Reserved", " ", 
        "This program is free software; you can redistribute it and/or", 
        "modify it under the terms of the GNU General Public License", 
        "as published by the Free Software Foundation; either version 2", 
        "of the License, or (at your option) any later version.", 
        "This program is distributed in the hope that it will be useful,", 
        "but WITHOUT ANY WARRANTY; without even the implied warranty of", 
        "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.", 
        "See the GNU General Public License for more details.", 
        "You should have received a copy of the GNU General Public License", 
        "along with this program; if not, write to the Free Software", 
        "Foundation, Inc., 51 Franklin Street, Fifth Floor, ", 
        "Boston, MA  02110-1301, USA.", " "
    };
    
      private static final String BOT_DETAILS_JODY[] = {
        "Jody's Chatbot",
        COPYRIGHT_TEXT, 
        "All Rights Reserved", " ", 
        "About:", 
        "Jody Chatbot is a customized version of Kutkut chatbot, which is also based on Alice bot.", 
        "Jody is a young and charming woman. She has good", 
        "knowledge about natural hair and can recommend treatment options for your hair. Isn't that cool? She's also very hip as regards pop culture references. She loves to talk and chat", 
        "with you. She's pretty animated also!", " ", 
    };
}
