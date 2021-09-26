public abstract class Figura implements Dibujable, Comparable<Figura>
{
    //Atributos
    protected int id;//codigo
    protected String borde;
    protected String relleno;
    protected Punto origen; //solo se puede heredar desde figura, sirve para determinar donde esta la figura

    //Constructor general

    public Figura(int id, String borde, String relleno, Punto origen)
    {
        this.id = id;
        this.borde = borde;
        this.relleno = relleno;
        this.origen = origen;
    }

    //Constructor vacio
    public Figura()
    {
    }

    //Metodos


    protected abstract double area();

    protected abstract double perimetro();

    public double distancia(Figura f){
        return Math.sqrt(Math.pow(f.origen.getX() - this.origen.getX(), 2) + Math.pow(f.origen.getY() - this.origen.getY(), 2));
    }

    public abstract void escalar(int porcentaje);

    public void mover(Punto p){
        this.setOrigen(p);
    }

    public void desplazarh(double x){
        this.origen = new Punto(x+this.origen.getX(),this.origen.getY());
    } //desplazar horizontalmente


    public void desplazarv(double y){
        this.origen = new Punto(y+this.origen.getX(),this.origen.getY());
    }; //desplazar verticalmente

    //Metodos Override

    @Override
    public int compareTo(Figura o)
    {
        return this.compareTo(o);
    }

    @Override
    public void dibujar()
    {
        System.out.println(this);
    }

    @Override
    public void rellenar()
    {
    }




    //Getters y Setters

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBorde()
    {
        return borde;
    }

    public void setBorde(String borde)
    {
        this.borde = borde;
    }

    public String getRelleno()
    {
        return relleno;
    }

    public void setRelleno(String relleno)
    {
        this.relleno = relleno;
    }

    public Punto getOrigen()
    {
        return origen;
    }

    public void setOrigen(Punto origen)
    {
        this.origen = origen;
    }
}
