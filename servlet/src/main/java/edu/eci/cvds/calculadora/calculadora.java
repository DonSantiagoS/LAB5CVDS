package edu.eci.cvds.calculadora;

import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.ApplicationScoped; 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.*;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
@SessionScoped

public class calculadora{
	
    public calculadora(){}
	public double get(){
		double res=0;
		return res;
	}
	public void set(){}

    public static double calculateMean(double[] valores) {
        double suvaloresa = 0;
		int longitud=valores.length;
        for (int i=0;i<longitud;i++) {
            suvaloresa+= valores[i];
        }
		double provaloresedio= suvaloresa/longitud;
        return provaloresedio;
    }
	
    public static double calculateStandardDeviation(double valores[]){
		double raiz=Math.sqrt(calculateVariance(valores));
        return raiz;
    }
    public static double calculateVariance(double valores[]){
        double promedio= calculateMean(valores);
		double sumaCuadrados=0;
		int longitud=valores.length;
		for (int i=0;i<longitud;i++){
			sumaCuadrados+= (valores[i]-promedio)*(valores[i]-promedio);
		}
		double resultado= sumaCuadrados/longitud;
		return resultado;
    }
    
    public double calculateMode(double valores[]){
		int longitud=valores.length;
		double valorModa=0;
		double vecesValorModa=0;
		int j;
		for (int i=0;i<longitud;i++){
			double aparicionesActuales=0;
			for (j=0;j<longitud;j++){
				if (valores[i]==valores[j]){
					aparicionesActuales+=1;
				}
			}
			if (vecesValorModa<aparicionesActuales){
				valorModa=valores[j];
				vecesValorModa=aparicionesActuales;
			}
		}
		return valorModa;
	}
    
	public void restart(){}
}
    
