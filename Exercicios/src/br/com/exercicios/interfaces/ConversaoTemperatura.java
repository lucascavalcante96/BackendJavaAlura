package br.com.exercicios.interfaces;

import java.util.Scanner;

public class ConversaoTemperatura extends ConversorTemperaturaPadrao {
    static void main() {
        ConversorTemperaturaPadrao conversor  = new ConversorTemperaturaPadrao();
        double temperatura;
        int seletor;
        int continuar;
        Scanner ler = new Scanner(System.in);


        while (true){
            System.out.println("Digite o temperatura: ");
            temperatura = ler.nextDouble();
            System.out.println("Digite 1 para converter para Fahrenheit ou 2 para Celcius ");
            seletor = ler.nextInt();
            if (seletor == 1) {
                double tempConvertida;
                tempConvertida = conversor.celsiusParaFahrenheit(temperatura);
                System.out.printf("A temperatura de %.2f°C convertida para Fahrenheit é de %.2f°F%n",temperatura,tempConvertida);
            }
            if (seletor == 2) {
                double tempConvertida;
                tempConvertida = conversor.fahrenheitParaCelsius(temperatura);
                System.out.printf("A temperatura de %.2f°F convertida para Celcius é de %.2f°C%n",temperatura,tempConvertida);
            }
            System.out.println("Deseja Converter outra temperatura? 1 para Sim ou 2 para Sair");
            continuar = ler.nextInt();
            if (continuar == 2) {
                break;
            }
        }
        ler.close();
    }
}
