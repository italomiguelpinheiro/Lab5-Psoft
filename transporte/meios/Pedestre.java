package transporte.meios;

import transporte.MeioTransporte;

public class Pedestre implements MeioTransporte{
   
    @Override
    public void calcularRota() {
        System.out.println("Calculando rota de Pedestre");
    }
}
