/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author user
 */
public class Programan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("username", "maria");
        cookies.put("email", "mariagostosinha@gmail.com");
        cookies.put("phone", "99711221");
        
        System.out.println("Countains 'phone' key: "+ cookies.containsKey("phone"));
        System.out.println("Phone number: "+ cookies.get("phone"));
        System.out.println("Size: "+ cookies.size() );
        
        cookies.remove("email");
         System.out.println("Email: "+cookies.get("email"));
        cookies.put("phone", "99773311");
        System.out.println("All COOKIES");
        for(String key: cookies.keySet()){
            System.out.println(key+" : "+ cookies.get(key));
        }
    }
    
}
