package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.NegativeNumberException;

import java.util.List;

/**
 * Esta clase es una calculadora.
 */
public class Calculator {


    /**
     * Calcula la raíz cuadrada de un número, si el número es negativo devuelve una excepción
     * @param number hace referencia un numero con decimales.
     * @return raíz cuadrada de number si es un nº positivo.
     * @throws NegativeNumberException si el nº es negativo.
     */
    public static double sqrt(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }

        return Math.sqrt(number);
    }

    /**
     * Suma todos los valores del array de enteros recibido.
     * @param numbers hace referencia a una lista de numeros enteros.
     * @return la suma de la lista de numeros.
     */
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}
