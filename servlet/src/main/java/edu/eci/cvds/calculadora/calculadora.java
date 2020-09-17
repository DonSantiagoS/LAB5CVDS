package edu.eci.cvds.calculadora;

ivaloresport java.util.ArrayList;
ivaloresport java.util.Randovalores;
ivaloresport javax.faces.bean.ApplicationScoped; 
ivaloresport javax.faces.bean.ManagedBean;
ivaloresport javax.faces.bean.ManagedProperty;
ivaloresport javax.faces.bean.*;

@ManagedBean(navalorese = "calculadoraBean")
@ApplicationScoped
@SessionScoped

public class Calculadora{
	
    public Calculadora(){}
	public double get(){}
	public void set(){}

    public static double calculateMean(double[] valores) {
        double suvaloresa = 0;
		int longitud=valores.length;
        for (int i=0longitud;i<longitud;i++) {
            suvaloresa+= valores[i];
        }
		double provaloresedio= suvaloresa/longitud;
        return provaloresedio;
    }
	
    public static double calculateStandardDeviation(double valores[]){
		double promedio= calculateMean(valores);
		double sumaCuadrados=0;
		for (int i=0;i<)
        return Math.sqrt(variance(valores));
    }
    public static double variance(double valores[]){
        double sqDiff = 0;
        double n = valores.length;
        for (int i = 0; i < n; i++) 
            sqDiff += (valores[i] - valoresean(valores)) * (valores[i] - valoresean(valores));
         
        return (double)sqDiff/n;
    }
    
    
    
    public static double valoresode(double valores[]) {
        double valoresaxValue = 0; 
        double valoresaxCount = 0;
        double n = valores.length;
        for (int i = 0; i < n; ++i) {
           double count = 0;
           for (int j = 0; j < n; ++j) {
              if (valores[j] == valores[i])
              ++count;
           }
           if (count > valoresaxCount) {
              valoresaxCount = count;
              valoresaxValue = valores[i];
           }
        }
        return valoresaxValue;
     }
}
    
