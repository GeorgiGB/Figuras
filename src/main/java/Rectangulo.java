public class Rectangulo extends Figura
{
    //Atributos
    public double base;
    public double altura;

    //Constructor

    public Rectangulo(int id, String borde, String relleno, Punto origen, double lado, double altura)
    {
        super(id, borde, relleno, origen);
        this.base = lado;
        this.altura = altura;
    }

    //Constructor vacio
    public Rectangulo()
    {}

    //Metodos

    @Override
    public String toString()
    {
        return "Rectangulo{" +
                "id=" + id +
                ", borde='" + borde + '\'' +
                ", relleno='" + relleno + '\'' +
                ", origen=" + origen +
                '}';
    }

    @Override
    public void dibujar()
    {

    }

    @Override
    public void rellenar()
    {

    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
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
        this.base = (porcentaje/100) * this.base;
        this.altura = (porcentaje/100) * this.altura;
    }

}
