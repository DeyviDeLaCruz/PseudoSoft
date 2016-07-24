
package anocongruenciales;

public class Cuadradosmedios {
    
    //Variables propias de la clase
    private String teoriacm="Este algoritmo no congruencial fue propuesto en la decada de los cuarenta por Von Newman y Metropolis. \n" +
    " * Requiere un numero entero detonador (llamado semilla) con D digitoos, el cual es elevado al cuadrado\n" +
    " * para seleccionar del resultado los D digitos del centro, el primer numero ri se determina simplemente\n" +
    " * anteponiendo el 0. a estos digitos. Para obtener el segundo ri se sigue el mismo procedimiento, solo que\n" +
    " * ahora se elevan al cuadrado los d digitos del centro que se seleccionaron para obtener el primer ri. Este\n" +
    " * metodo se repite hazta obtener n numeros ri.";
    private String instrucciones="Para generar números aleatorios de cuadrados medios se siguen los siguientes pasos: \n" +
"\n" +
"1. Seleccionar una semilla (Xo) con D dígitos (D>3). \n" +
"2. Sea Xo = resultado de elevar Xo al cuadraado; sea X1 = los D dígitos del centro y sea ri = 0.D dígitos del centro. \n" +
"3. Sea Yi = resultado de elevar Xi al cuadrado; sea Xi+1 =los D dígitos del centro y sea ri =  0.D dígitos del centro para toda i = 1,2,3…n. \n" +
"4. Repetir el paso anterior hasta obtener los n números ri deseados. \n" +
"* Si no es posible obtener los D dígitos del centro del número Yi , agregue ceros a la izquierda del número Yi";
    
    private double semilla, cantidad;
    private double semillacuadrada = 0;
    
    //constructor

    public Cuadradosmedios() {
    }

    public Cuadradosmedios(double semilla, double cantidad) {
        this.semilla = semilla;
        this.cantidad = cantidad;
    }
    
    //get y set

    public String getTeoriacm() {
        return teoriacm;
    }

    public void setTeoriacm(String teoriacm) {
        this.teoriacm = teoriacm;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public double getSemilla() {
        return semilla;
    }

    public void setSemilla(double semilla) {
        this.semilla = semilla;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSemillacuadrada() {
        return semillacuadrada;
    }

    public void setSemillacuadrada(double semillacuadrada) {
        this.semillacuadrada = semillacuadrada;
    }

    
    //funciones
    public void Generarcm(){
    semillacuadrada=0;
        System.out.println(""+semilla);
        for (int i = 0; i < cantidad; i++) {
            semillacuadrada = semilla * semilla;
            System.out.println(""+semillacuadrada);
            String Nsemillacuadrada;
            Nsemillacuadrada = String.valueOf(semillacuadrada);
            String D4;
            D4 = Nsemillacuadrada.substring(2, 4);
            semilla = Double.parseDouble(D4); //tambien puede ir entero
            
           // System.out.println("0."+semilla);
        }
    }
    
    
    
    
    
    
    
}
