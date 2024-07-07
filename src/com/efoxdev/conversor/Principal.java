package com.efoxdev.conversor;

import com.efoxdev.conversor.models.Conversor;
import com.efoxdev.conversor.services.ConexionAPI;
import com.efoxdev.conversor.services.Mensajes;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConexionAPI convertirMonedas = new ConexionAPI();
        boolean stopProgram = false;
        Scanner teclado = new Scanner(System.in);
        int seleccionUsuario = 0;
        double cantidadUsuario = 0.0;
        Conversor resultadoConversion = null;
        while(!stopProgram) {
            System.out.print("""
                ******************************************
                *** Bienvenido al Conversor de Monedas ***
                Selecciona una de las siguientes opciones:
                1 - Dólar a Peso Colombiano (USD - COP)
                2 - Peso Colombiano a Dólar (COP - USD)
                3 - Euro a Peso Colombiano (EUR - COP)
                4 - Peso Colombiano a Euro (COP - EUR)
                5 - Dólar a Peso Chileno (USD - CLP)
                6 - Peso Chileno a Dólar (CLP - USD)
                7 - Euro a Peso Chileno (EUR - CLP)
                8 - Peso Chileno a Euro (CLP - EUR)
                0 - Salir del programa
                ******************************************
                """);
            try {
                seleccionUsuario = teclado.nextInt();
                switch (seleccionUsuario) {
                    case 1:
                        System.out.println("Por favor, ingresa cuántos dólares quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("USD", "COP", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "COP");
                        break;
                    case 2:
                        System.out.println("Por favor, ingresa cuántos pesos quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("COP", "USD", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "USD");
                        break;
                    case 3:
                        System.out.println("Por favor, ingresa cuántos euros quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("EUR", "COP", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "COP");
                        break;
                    case 4:
                        System.out.println("Por favor, ingresa cuántos pesos quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("COP", "EUR", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "EUR");
                        break;
                    case 5:
                        System.out.println("Por favor, ingresa cuántos dólares quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("USD", "CLP", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "CLP");
                        break;
                    case 6:
                        System.out.println("Por favor, ingresa cuántos pesos quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("CLP", "USD", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "USD");
                        break;
                    case 7:
                        System.out.println("Por favor, ingresa cuántos euros quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("EUR", "CLP", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "CLP");
                        break;
                    case 8:
                        System.out.println("Por favor, ingresa cuántos pesos quieres convertir");
                        cantidadUsuario = teclado.nextDouble();
                        resultadoConversion = convertirMonedas.obtenerDatos("CLP", "EUR", cantidadUsuario);
                        Mensajes.mostrarMensaje(resultadoConversion.conversion_result(), resultadoConversion.conversion_rate(), "EUR");
                        break;
                    case 0:
                        System.out.println( "Gracias por utilizar el conversor de monedas.");
                        System.out.println("Saliendo del programa...");
                        stopProgram = true;
                        break;
                    default:
                        System.out.println("No seleccionaste una opción válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Escribe únicamente números.");
                System.out.println("Saliendo del programa...");
                stopProgram = true;
            }

        }

    }
}
