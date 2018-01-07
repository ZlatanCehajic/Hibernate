/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernacija;

import entities.Klub;
import java.util.Scanner;
import org.hibernate.Session;

/**
 *
 * @author ZLATAN
 */
public class Hibernacija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session s = Engine.getSession();
        
        Klub klub = (Klub)s.get(Klub.class, 3);
        System.out.println(klub);
        
       /* Klub klub =  new Klub();
        klub.drzava = "Spanija";
        klub.naziv = "Barca";
       s.save(klub);
        System.out.println(klub.id);*/
       
        
    }
    
}
//repozitory 