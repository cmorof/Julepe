
public class Carta
{
    private int valor;
    private Palo palo;
    
    public Carta(int valor, Palo palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor()
    {
        return valor;
    }
    
    public Palo getPalo()
    {
        return palo;
    }
    
    public String toString()
    {
        String nombreCarta = "";
        
        String textoValor = Integer.toString(valor);
        String textoPalo = "";
        
        switch (palo)
        {
            case OROS:
            textoPalo = "oros";
            break;
            case COPAS:
            textoPalo = "copas";
            break;
            case ESPADAS:
            textoPalo = "espadas";
            break;
            case BASTOS:
            textoPalo = "bastos";
        }
        
        switch (valor)
        {
            case 1:
            textoValor = "as";
            break;
            case 2:
            textoValor = "2";
            break;
            case 3:
            textoValor = "3";
            break;
            case 4:
            textoValor = "4";
            break;
            case 5:
            textoValor = "5";
            break;
            case 6:
            textoValor = "6";
            break;
            case 7:
            textoValor = "7";
            break;
            case 10:
            textoValor = "sota";
            break;
            case 11:
            textoValor = "caballo";
            break;
            case 12:
            textoValor = "rey";
        }
        
        nombreCarta = textoValor + " de " + palo;
        return nombreCarta;
    }
    
    public boolean ganaA(Carta cartaPasada, int paloQuePinta)
    {
         boolean gana = false;
         
         if(palo == cartaPasada.getPalo())
         {
             if(getPosicionEscalaTute() > cartaPasada.getPosicionEscalaTute())
             {
                gana = false;
             }
         }
         
         else 
         {
             gana = true;
         }
         
         return gana;
    }
    
    public int getPosicionEscalaTute()
    {
        int posicion = valor;
        
        if (valor == 3)
        {
            posicion = 13;
        }
        
        else if (valor == 1)
        {
            posicion = 14;
        }
        
        return posicion;
    }
}
