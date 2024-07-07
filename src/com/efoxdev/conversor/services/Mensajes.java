package com.efoxdev.conversor.services;

import java.text.DecimalFormat;

public class Mensajes {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat dfRate = new DecimalFormat("0.00000");

    public static void mostrarMensaje(Double resultado, Double rate, String currency) {
        if(currency.equals("EUR")) {
            System.out.println("Resultado: " + df.format( resultado ) + " " + currency);
            System.out.println("Tasa del día: " + dfRate.format( rate ) + " " + currency);
        } else {
            System.out.println("Resultado: $ " + df.format( resultado ) + " " + currency);
            System.out.println("Tasa del día: $ " + dfRate.format( rate ) + " " + currency);
        }
    }
}
