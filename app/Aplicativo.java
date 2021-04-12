package app;

import transporte.MeioTransporte;
import transporte.MeioTransporteCreator;

public class Aplicativo {
    private MeioTransporte meioTransporte;

    public void escolherMeioTransporte(int id) {
        meioTransporte = MeioTransporteCreator.definirMeioTransporte(id);
        meioTransporte.calcularRota();
    }

}