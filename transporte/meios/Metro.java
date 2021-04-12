package transporte.meios;

import transporte.MeioTransporte;

public class Metro implements MeioTransporte{
  
    @Override
    public void calcularRota() {
        System.out.println("Calculando rota de Metro");
    }
}
