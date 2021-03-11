package es;

/**
 * A classe Calculadora cont�m m�todos para realizar as opera��es aritmeticas basicas com numeros reais. 
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
	 * Calcula a subtra��o de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da subtra��o dos dois operandos
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	/**
	 * Calcula a multiplica��o de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da multiplica��o dos dois operandos
	 */
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	/**
	 * Calcula a divis�o de dois numeros reais.
	 * @param operando1 valor do operando 1
	 * @param operando2 valor do operando 2
	 * @return returna o resultado da divis�o dos dois operandos
	 *        No caso da divis�o por zero, retorna infinity e nao gera qualquer excep��o
	 * 
	 */
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	
	
}
