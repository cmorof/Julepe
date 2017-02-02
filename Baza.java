import java.util.ArrayList;

public class Baza
{
    private int numeroJugadores;
    private int paloQuePinta;
    private Carta[] baza;
    private int contador;
    
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        this.numeroJugadores = numeroJugadores;
        this.paloQuePinta = paloQuePinta;
        baza = new Carta[numeroJugadores];
        contador = 0;
    }
    
    public void addCarta(Carta cartaQueTiraUnJugador, String nombreJugador)
    {
        baza[contador] = cartaQueTiraUnJugador;
        contador++;
    }
    
    public int getPaloPrimeraCartaDeLaBaza()
    {
        int getPalo;
        if (contador == 0)
        {
            getPalo = -1;
        }
        else
        {
            getPalo = baza[0].getPalo();
        }
        return getPalo;
    }
    
    public Carta cartaQueVaGanandoLaBaza()
    {
        Carta cartaQueGana = null;
        boolean buscando = true;
        
        for (int i = 0; i < baza.length; i++)
        {
            if(baza[i] == null)
            {
                buscando = false;
            }
        }
        
        if(buscando == true)
        {
            int i = 0;
            while (i < baza.length)
            {
                if(cartaQueGana.ganaA(baza[i], paloQuePinta) == true)
                {
                    cartaQueGana = baza[i];
                    i++;
                }
            }
        }
        return cartaQueGana;
    }
}
