/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipadresial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Faruk
 */
public class IpAdresiAl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://bot.whatismyipaddress.com");
            URLConnection connection= url.openConnection();
            String str=null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            str = reader.readLine();
            System.out.println(str);
        } catch (Exception e) {
        }
    }
    
}
