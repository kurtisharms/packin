/*
 * Main.java
 *
 * Created on November 9, 2007, 8:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package src.packin;

/**
 *
 * @author kurtis
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
        if(!System.getProperty("java.version").contains("6."))
        {
            System.out.println("\n\nERROR! You are using an older version of the Java runtime. Please go to http://www.java.com/ to download and install the latest Java runtime environment for your computer!\nYou are currently using JRE version: "+ System.getProperty("java.version") + "\nThis application requires JRE version: 1.6.x");
        }
        else {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        }
        } catch (Exception ex) {
                     System.out.println("\n\nERROR! You are using an older version of the Java runtime. Please go to http://www.java.com/ to download and install the latest Java runtime environment for your computer!\nYou are currently using JRE version: "+ System.getProperty("java.version") + "\nThis application requires JRE version: 1.6.x");
        }

    }
    
}
