import java.util.ArrayList;

public class Lienzo implements Dibujable
{
    public ArrayList<Figura> figuras = new ArrayList();
    //Programa principal
    public static void main(String[] args)
    {

    }

    //Metodos

    @Override
    public void dibujar()
    {
        for (Figura f : figuras)
        {
            f.dibujar();
        }
    }

    @Override
    public void rellenar()
    {

    }
}
