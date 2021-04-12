package transporte.meios;

import transporte.MeioTransporte;

public class Carro implements MeioTransporte{
    
    @Override
    public void calcularRota() {
        System.out.println("Calculando rota de Carro");        
    }
}
