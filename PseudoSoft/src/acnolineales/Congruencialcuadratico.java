/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acnolineales;

/**
 *
 * @author Deyvi
 */
public class Congruencialcuadratico {
    public String cuadra(double m, double ri, double xi, double contador){
        
        //para que el ciclo termine
        if(contador!=m){
            int a=26;   //numero par
            int b=27;   //b-1)mod4=1
            int c=27;   //numero impar
            contador++;
            //la fprmula, genera los numeros
            xi=((a*Math.pow(xi, 2))+b*xi+c)%m;
            //los numeros entre 0 y 1
            ri=(xi/(m-1));
            return ri+"\n"+cuadra(m,ri,xi,contador);
        }
        else{
            return "fin";
        }
    }
        public static void main(String[] args){
            Congruencialcuadratico aa=new Congruencialcuadratico();
            System.out.println(aa.cuadra(8,0,13,0));
        
    }
}
