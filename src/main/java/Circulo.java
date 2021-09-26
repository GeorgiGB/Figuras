public class Circulo extends Figura
{
    //Atributos
    public double radio;

    //Constructores

    public Circulo(int id, String borde, String relleno, Punto origen, double radio)
    {
        super(id, borde, relleno, origen);
        this.radio = radio;
    }

    //Constructor vacio
    public Circulo()
    {}

    //Metodos


    @Override
    public String toString()
    {
        return "Circulo{" +
                "id=" + id +
                ", borde='" + borde + '\'' +
                ", relleno='" + relleno + '\'' +
                ", origen=" + origen +
                '}';
    }

    @Override
    protected double area()
    {
        return Math.PI*(radio*radio);
    }

    @Override
    protected double perimetro()
    {
        return 2*Math.PI*radio;
    }

    @Override
    public void escalar(int porcentaje)
    {
        this.radio = (porcentaje/100)*this.radio;
    }

}
