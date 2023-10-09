package Exe04;

public class Atributos {

	public static double Converter(double valor, double quantidade) {
		double Total = valor * quantidade;		
		double IOF = 0.06 * Total;
		return Total + IOF;
	}
}
