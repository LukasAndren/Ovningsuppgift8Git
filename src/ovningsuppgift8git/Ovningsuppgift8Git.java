/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ovningsuppgift8git;

/**
 *
 * @author buster
 */
public class Ovningsuppgift8Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forare förare1 = new Forare("Erik");
        Bilar bil1 = new Bilar("A6");
        
        System.out.println(bil1.modell);
        System.out.println(förare1.namn);
        System.out.println(bil1.modell + " " + förare1.namn);
        
    
    }

}
