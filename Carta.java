
public class Carta
{
    
    private int valor;
    private int palo;
    
    public Carta(int valor, int palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor()
    {
        return valor;
    }
    
    public int getPalo()
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
            case 0:
            textoPalo = "oros";
            break;
            case 1:
            textoPalo = "copas";
            break;
            case 2:
            textoPalo = "espadas";
            break;
            case 3:
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
        
        nombreCarta = textoValor + "de" + textoPalo;
        return nombreCarta;
    }
}
