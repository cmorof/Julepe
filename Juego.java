import java.util.Random;
import java.util.ArrayList;

public class Juego
{
    private Jugador[] jugadores;
    private Mazo mazo;
    private Carta cartaQuePinta;
    
    public Juego(int numeroJugadores)
    {
        mazo = new Mazo();
        jugadores = new Jugador[numeroJugadores];
        
        ArrayList<String> posiblesNombres = new ArrayList<String>();
        posiblesNombres.add("Pepe");
        posiblesNombres.add("María");
        posiblesNombres.add("Juan");
        posiblesNombres.add("Luis");
        posiblesNombres.add("Marcos");
        posiblesNombres.add("Omar");
        posiblesNombres.add("Carlos");
        posiblesNombres.add("Azahara");
        
        Random aleatorio = new Random();
        for(int i = 0; i < numeroJugadores; i++)
        {
            int posicionNombreElegido = aleatorio.nextInt(posiblesNombres.size());
            String nombreAleatorioElegido = posiblesNombres.get(posicionNombreElegido);
            posiblesNombres.remove(posicionNombreElegido);
            
            Jugador jugador = new Jugador(nombreAleatorioElegido);
            jugadores[i] = jugador;
        }
    }

    public void repartir()
    {
        
    }
    
    public void verCartasJugador()
    {
    
    }
}
