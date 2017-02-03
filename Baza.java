import java.util.ArrayList;

public class Baza
{
    private int numeroJugadores;
    private int paloQuePinta;
    private int contador;
    private Carta[] baza;
    private Carta cartaQueGana;
    private String nombreJugadorQueVaGanando;
    
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        this.numeroJugadores = numeroJugadores;
        this.paloQuePinta = paloQuePinta;
        baza = new Carta[numeroJugadores];
        contador = 0;
        cartaQueGana = null;
        nombreJugadorQueVaGanando = null;
    }
    
    public void addCarta(Carta cartaTirada, String nombreJugador)
    {
        baza[contador] = cartaTirada;
        contador++;
        if (contador == 0)
        {
            cartaQueGana = cartaTirada;
            nombreJugadorQueVaGanando = nombreJugador;
        }
        else
        {
            if (cartaTirada.ganaA(cartaQueGana, paloQuePinta))
            {
                cartaQueGana = cartaTirada;
                nombreJugadorQueVaGanando = nombreJugador;
            }
        }
        
    }
    
    public int getPaloPrimeraCartaDeLaBaza()
    {
        int getPalo = -1;
        if (contador != 0)
        {
            getPalo = baza[0].getPalo();
        }
        return getPalo;
    }
    
    public Carta cartaQueVaGanandoLaBaza()
    {
        return cartaQueGana;
    }
    
    public String nombreJugadorQueVaGanandoLaBaza()
    {
        return nombreJugadorQueVaGanando;
    }
}
