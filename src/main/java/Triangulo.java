public class Triangulo extends Figura
{
    //Atributo
    private double base;
    private double altura;


    //Constructor
    public Triangulo(int id, String borde, String relleno, Punto origen, double base, double altura)
    {
        super(id, borde, relleno, origen);
        this.base = base;
        this.altura = altura;
    }

    //Constructor vacio
    public Triangulo()
    {
    }

    @Override
    public String toString()
    {
        return "Triangulo{" +
                "id=" + id +
                ", borde='" + borde + '\'' +
                ", relleno='" + relleno + '\'' +
                ", origen=" + origen +
                '}';
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    protected double area()
    {
        return 0;
    }

    @Override
    protected double perimetro()
    {
        //(base*2) + altura
        return this.base + this.altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public void escalar(int porcentaje)
    {
        this.base = (porcentaje/100) * this.base;
        this.altura = (porcentaje/100) * this.altura;
    }

}
