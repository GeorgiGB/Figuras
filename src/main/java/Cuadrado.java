public class Cuadrado extends Figura
{
    //atributo
    public double lado;

    //Constructor
    public Cuadrado(int id, String borde, String relleno, Punto origen, double lado)
    {
        super(id, borde, relleno, origen);
        this.lado = lado;
    }

    public Cuadrado()
    {
    }

    //Metodos
    @Override
    public String toString()
    {
        return "Cuadrado{" +
                "id=" + id +
                ", borde='" + borde + '\'' +
                ", relleno='" + relleno + '\'' +
                ", origen=" + origen +
                '}';
    }

    @Override
    protected double area()
    {
        return 0;
    }

    @Override
    protected double perimetro()
    {
        return 0;
    }

    @Override
    public double distancia(Figura f)
    {
        return 0;
    }

    @Override
    public void escalar(int porcentaje)
    {
        this.lado = (porcentaje/100)*this.lado;
    }

    @Override
    public void dibujar()
    {

    }

    @Override
    public void rellenar()
    {

    }

    @Override
    public int compareTo(Figura o)
    {
        return 0;
    }
}
