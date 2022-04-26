package atv01.questao12;

import java.util.Random;

public class RandomService {

    //Singleton

    private Random random;
    private static RandomService instancia = null;

    private RandomService(){ random = new Random(); }

    public static RandomService getInstancia(){
        if(instancia == null)
            instancia = new RandomService();
        return instancia;
    }

    public int getNumeroAleatorio(){
        return random.nextInt(100) + 1; //valor entre 1 e 100
    }
}
