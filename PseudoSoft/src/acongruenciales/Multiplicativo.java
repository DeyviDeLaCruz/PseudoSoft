/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acongruenciales;

import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;

class Congruencial extends Thread{
/**
 * 
 *
 * @author Deyvi
 */
    boolean ConSemilla;
    double a;double b;
    double m;double Xno;
    double xn1;double ri;
    
    
public Congruencial() {
    
    
    super("Congruencial");
    a=16897;
        m= Math.pow(2, 31)-1;
        b=0;Xno=30269;
    
    
}
@Override
public void run() {
while (true){
xn1 = (a*Xno+b)%m;
ri=xn1/m;
try{
    System.out.println("Xno"+Xno+"xn1"+xn1+"ri"+ri);
    Xno=xn1;
    sleep(3000);
}catch(Exception e){}
}
}
}
public class Multiplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Congruencial aleatorio = new Congruencial();
    aleatorio.start();
    }
    
}
