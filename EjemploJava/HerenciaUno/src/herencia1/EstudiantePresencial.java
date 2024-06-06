
package herencia1;

public class EstudiantePresencial extends Estudiante{
    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\nCosto Matricula: %.2f\n", 
                nombresEstudiante,
                matriculaPresencial);
        return cadena;
    }
    /*
    En el metodo toString se puede utilizar los metodos y atributos de la
    superclase Estudiante ya que se heredan de ahi, ademas de que son 
    protegidos y se los puede utilizar sin problemas
    */
    
}
