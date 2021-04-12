package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = -1;
        Aplicativo aplicativo = new Aplicativo();

        while (escolha != 0) {
            System.out.println("\n Meio de transporte:");
            System.out.println("[1] Pedestre");
            System.out.println("[2] Carro");
            System.out.println("[3] Onibus");
            System.out.println("[4] Metro");
            System.out.println("[0] Voce chegou a seu destino");
            Scanner in = new Scanner( System.in );
            escolha = in.nextInt();

            if (escolha != 0) {
                escolherMeioTransporte(escolha, aplicativo);
            }
        }
    }

    private static void escolherMeioTransporte(int escolha, Aplicativo aplicativo) {
            aplicativo.escolherMeioTransporte(escolha);
    }

}