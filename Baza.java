import java.util.ArrayList;

public class Baza
{
    private int numeroJugadores;
    private int paloQuePinta;
    private Carta[] baza;
    
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        numeroJugadores = 0;
        paloQuePinta = 0;
        baza = new Carta[numeroJugadores];
    }
    
    public void addCarta(Carta cartaQueTiraUnJugador, String nombreJugador)
    {
        int i = 0;
        baza[i] = cartaQueTiraUnJugador;
        i++;
    }
}
