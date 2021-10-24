/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbbscoreboard2.Classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Jireh Vallespin
 */
public class OBBSboardConfigs {
    public static Properties prop = new Properties();
    
    public void SaveProp(String title, String Value){
        try {
            prop.setProperty(title, Value);
            prop.store(new FileOutputStream("Obbsb.conf"), null);
        } catch (Exception e) {
            
        }
    };
    
    public  String GetProp(String title){
        String Value = "";
        try {
            prop.load(new FileInputStream("Obbsb.conf"));
           Value = prop.getProperty(title);
        } catch (Exception e) {
            
        }
        return Value;
    };
}
