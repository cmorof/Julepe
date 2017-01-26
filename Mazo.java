import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Mazo
{
    private ArrayList<Carta> mazo;
    private Random aleatorio;
    
    public Mazo()
    {
        mazo = new ArrayList();
        aleatorio = new Random();
        
    }

    public void verCartasDelMazo()
    {
        for (int i = 0; i < mazo.size(); i++)
        {
            System.out.println(mazo.get(i));
        }
    }
    
    public void barajar()
    {
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++)
        {
            Carta cartal = mazo.get(posicionActual);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazo.size());
            mazo.set(posicionActual, mazo.get(posicionAleatoria));
            mazo.set(posicionAleatoria, cartal);
        }
    }
    
    public Carta sacarCarta()
    {
        Carta cartaADevolver = null;
        if(mazo.size() > 0)
        {
            cartaADevolver = mazo.remove(0);
        }
        return cartaADevolver;
    }
}
