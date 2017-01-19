
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
        if(palo >= 0 && palo <= 3 || valor >= 1 && valor <= 7 || valor >= 10 && valor <= 12)
        {
            if (valor == 1)
            {
                nombreCarta = "as";
            }
            else if (valor == 2)
            {
                nombreCarta = "2";
            }
            else if (valor == 3)
            {
                nombreCarta = "3";
            }
            else if (valor == 4)
            {
                nombreCarta = "4";
            }
            else if (valor == 5)
            {
                nombreCarta = "5";
            }
            else if (valor == 6)
            {
                nombreCarta = "6";
            }
            else if (valor == 7)
            {
                nombreCarta = "7";
            }
            else if (valor == 10)
            {
                nombreCarta = "sota";
            }
            else if (valor == 11)
            {
                nombreCarta = "caballo";
            }
            else if (valor == 12)
            {
                nombreCarta = "rey";
            }
            if (palo == 0)
            {
                nombreCarta += " de oros";
            }
            else if (palo == 1)
            {
                nombreCarta += " de copas";
            }
            else if (palo == 2)
            {
                nombreCarta += " de espadas";
            }
            else if (palo == 3)
            {
                nombreCarta += " de bastos";
            }
        }
        else
        {
            System.out.println("valores erroneos");
        }
        return nombreCarta;
    }
}
