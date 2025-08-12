/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartagenaaltamirano_20250811;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // VARIABLES LOCALES
    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES LOCALES
        int segundosTotales = 469423;
        //Se asigna el valor de dia a la variable local
        int dias = calcularDias(segundosTotales);
        // Se asigna el valor de los segundos excendentes o restantes despues de haber
        // calculado los dias
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        // Se asigna el valor de las horas a partir de los segundos excendentes del calculo de dias
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        // Se asigna el valor de los segundos excedentes a partir del calculo de las horas
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        // Se asigna el valor de los minutos a partir de los segundos restantes del calculo de las horas
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        // Los segundos que quedan despues de haber realizado todos los calculos anteriores
        int segundosFinales = obtenerLosSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado calcular los dias, horas, minutos y segundos a partir de un numero mayor a 84600");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);
        
        
    }
    // Modulo para calcular la cantidad de dias 
    public static int calcularDias(int segundosTotales){
        return segundosTotales /(Main.horasEnUnDia*Main.segundosEnUnaHora);
        
    }
    // Modulo para calcular los segundos restantes despues de extraer los dias
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
        
    }
    // Modulo para calcular las horas
    public static int calcularHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    // Modulo para calcular los segundos restantes despues de extraer las horas
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras (int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    // Modulo para calcular la cantidad de minutos a partir de los segundos restantes
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    // Modulo para calcular los segundos restantes
    public static int obtenerLosSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnMinuto;
    }
}
