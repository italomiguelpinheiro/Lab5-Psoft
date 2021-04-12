package transporte;

import transporte.meios.Carro;
import transporte.meios.Metro;
import transporte.meios.Onibus;
import transporte.meios.Pedestre;

public class MeioTransporteCreator {
    public static MeioTransporte definirMeioTransporte(int id) {
        if (id == 1) {
            return new Pedestre();
        }

        else if (id == 2) {
            return new Carro();
        }

        else if (id == 3) {
            return new Onibus();
        }

        else {
            return new Metro();
        }
    }
}