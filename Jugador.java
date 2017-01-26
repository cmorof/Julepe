    
public class Jugador
{
    private String nombre;
    private Carta[] mano;
    private int numeroCartasEnLaMano;

    public Jugador(String nombreJugador)
    {
        nombre = nombreJugador;
        mano = new Carta[5];
        numeroCartasEnLaMano = 0;
    }
    
    /**
     * Método que hace que el jugador reciba una carta
     */
    public void recibirCarta(Carta cartaRecibida)
    {
        if(numeroCartasEnLaMano < 5)
        {
            mano[numeroCartasEnLaMano] = cartaRecibida;
            numeroCartasEnLaMano++;
        }
    }
    
    /**
     * Método que muestra las cartas del jugador por pantalla
     */
    public void verCartasJugador()
    {
        for(Carta cartaActual : mano)
        {
            if(cartaActual != null)
            {
                System.out.println(cartaActual);
            }
        }
    }
}
