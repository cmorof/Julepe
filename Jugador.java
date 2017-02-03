import java.util.Random;
    
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
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Carta tirarCarta(String nombreCarta)
    {
        Carta cartaTirada = null;
        
        if (numeroCartasEnLaMano > 0)
        {
            int cartaActual = 0;
            boolean buscando = true;
            while(cartaActual < mano.length && buscando)
            {
                if(mano[cartaActual] != null)
                {
                    if (nombreCarta.equals(mano[cartaActual].toString()))
                    {
                        buscando = false;
                        cartaTirada = mano[cartaActual];
                        mano[cartaActual] = null;
                        numeroCartasEnLaMano--;
                        System.out.println(nombre + " ha tirado " + cartaTirada);
                    }
                }    
                cartaActual++;
            }
        }
        
        return cartaTirada;
    }
    
    /**
     * Método que tira una carta aleatoria
     */
    
    public Carta tirarCartaAleatoria()
    {
        Carta cartaTirada = null;

        if (numeroCartasEnLaMano > 0)
        {
            Random aleatorio = new Random();
            
            boolean elJugadorHaTiradoUnaCarta = false;
            while(elJugadorHaTiradoUnaCarta == false)
            {
                int posicionAleatoria = aleatorio.nextInt(5);
                if(mano[posicionAleatoria] != null)
                {
                    cartaTirada = mano[posicionAleatoria];
                    mano[posicionAleatoria] = null;
                    numeroCartasEnLaMano--;
                    System.out.println(nombre + " ha tirado " + cartaTirada);
                    elJugadorHaTiradoUnaCarta = true;
                }
            }
        }
        
        return cartaTirada;
    }
    
        public Carta tirarCartaInteligentemente(int paloPrimeraCarta, Carta cartaQueGana, int paloQuePinta)
    {
        return tirarCartaAleatoria();
    }
}
