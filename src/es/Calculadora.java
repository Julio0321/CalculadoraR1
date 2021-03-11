package es;

/**
 * A classe Calculadora contém métodos para realizar as operações aritmeticas basicas com numeros reais. 
 * 
 * <ul>
 * <li>somar</li>
 * <li>subtrair</li>
 * <li>multiplicar</li>
 * <li>dividir</li>
 * </ul>
 * 
 * @author juliu
 *
 */
public class Calculadora {

	
	/**
	 * Calcula a soma de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da soma dos dois operandos
	 */
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	/**
	 * Calcula a subtração de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da subtração dos dois operandos
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	/**
	 * Calcula a multiplicação de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da multiplicação dos dois operandos
	 */
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	/**
	 * Calcula a divisão de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da divisão dos dois operandos
	 *        No caso da divisão por zero, retorna infinity e nao gera qualquer excepção
	 * 
	 */
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	
	
}
