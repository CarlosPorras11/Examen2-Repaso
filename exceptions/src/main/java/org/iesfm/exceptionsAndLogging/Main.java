package org.iesfm.exceptionsAndLogging;

import org.iesfm.exceptionsAndLogging.exceptions.NegativeAgeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public int askInt() throws NegativeAgeException{
        log.info("Introduce un nº entero");
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n < 0){
            log.warn("No puedes introducir nº negativos");
        }
        return n;
    }

    public int askAge(){
        int age = askInt();


    }

    public User createUser() throws NegativeAgeException {
        log.info("Introduce el nombre");
        String name = scanner.nextLine();
        log.info("Introduce el apellido");
        String surname = scanner.nextLine();
        log.info("Introduce la edad");
        int age =
    }
}
