/*
* 	Packin Linux Debian Package Creator- Project Website hosted at <http://packin.sf.net/>.
*   Copyright (C) 2007-2008  Packin Team
*
*   This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
*   (at your option) any later version.
*   
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU General Public License for more details.
*   
*   You should have received a copy of the GNU General Public License
*   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package src.packin;


public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
         * This class method simply verifies that JRE SE 1.6.x is installed, and then
         * opens a MainFrame window
         */
        try {
            
        if(!System.getProperty("java.version").contains("6."))
        {
            System.out.println("\n\nERROR! You are using an older version of the Java runtime. Please go to http://www.java.com/ to download and install the latest Java runtime environment for your computer!\nYou are currently using JRE version: "+ System.getProperty("java.version") + "\nThis application requires JRE version: 1.6.x, also known as JRE SE 6.");
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
