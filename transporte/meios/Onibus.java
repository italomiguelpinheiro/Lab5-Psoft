  
package transporte.meios;

import transporte.MeioTransporte;

public class Onibus implements MeioTransporte {

    @Override
    public void calcularRota() {
        System.out.println("Calculando rota de Onibus");
    }
}