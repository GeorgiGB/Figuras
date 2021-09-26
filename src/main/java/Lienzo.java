import java.util.ArrayList;
import java.util.Collections;

/*
 *@author Georgi Georgiev
 */
public class Lienzo
{
    public static ArrayList<Figura> figuras = new ArrayList();

    //Programa principal
    public static void main(String[] args)
    {
        Random();
        int ID;
        boolean start = true;
        //Menu opciones + nombre ejercicio
        Utilidades.liniadoble(25);
        System.out.println(Dibujable.GREEN + "Ejercicio Figuras" + Dibujable.RESET);
        Utilidades.liniadoble(25);

        System.out.println(Dibujable.YELLOW + "Opciones disponibles: ");

        Utilidades.liniadoble(25);
        System.out.println(Dibujable.BLUE +
                "1.- Listar" +
                "\n2.- Dibujar" +
                "\n3.- Perímetros" +
                "\n4.- Areas" +
                "\n5.- Escalar" +
                "\n6.- Mover" +
                "\n7.- Desplazar" +
                "\n8.- Ordenar" +
                "\n9.- Salir");
        int opc = Utilidades.leerEntero(Dibujable.YELLOW + "Seleccione una opción: " + Dibujable.GREEN + Dibujable.RESET);
        Utilidades.liniadoble(25);
        switch (opc)
        {
            case 1:
                Lienzo.listar();
                break;


            case 2:
                Lienzo.dibujar();
                break;


            case 3:
                Lienzo.perimetro();
                break;


            case 4:
                Lienzo.area();
                break;


            case 5:
                ID = Utilidades.leerEntero("Introduce el id de la figura: ");
                int porcentaje = Utilidades.leerEntero("Introduce el porcentaje: ");
                Lienzo.escalar(ID, porcentaje);
                break;


            case 6:
                ID = Utilidades.leerEntero("Introduce el id de la figura: ");
                Punto p = new Punto(Utilidades.leerDouble("Introduce la 'x': "), Utilidades.leerDouble("Introduce la 'y': "));
                Lienzo.mover(ID, p);
                break;


            case 7:
                ID = Utilidades.leerEntero("Introduce el id de la figura: ");
                String res = Utilidades.leerTexto("Vertical/Horizontal ? ");
                double move = Utilidades.leerDouble("Indica la cantidad a desplazar: ");
                if (res.equalsIgnoreCase("VERTICAL"))
                {
                    Lienzo.desplazarv(ID, move);
                } else if (res.equalsIgnoreCase("HORIZONTAL"))
                {
                    Lienzo.desplazarh(ID, move);
                } else
                {
                    System.out.println(Dibujable.RED + "¡Error en el desplazamiento!" + Dibujable.RESET);
                }
                break;


            case 8:
                System.out.println(Dibujable.YELLOW + "Criterios de comparación: ");
                Utilidades.linia(25);
                System.out.println(Dibujable.BLUE +
                        "1.- Area" +
                        "\n2.- Perímetro" +
                        "\n3.- Posición");
                int opc2 = Utilidades.leerEntero(Dibujable.YELLOW + "Seleccione una opción: " + Dibujable.GREEN + Dibujable.RESET);
                System.out.println(Dibujable.YELLOW + "\nOrden: ");
                System.out.println(Dibujable.BLUE +
                        "1.- Ascendente" +
                        "\n2.- Descendente");
                int opc3 = Utilidades.leerEntero(Dibujable.YELLOW + "Seleccione una opción: " + Dibujable.GREEN + Dibujable.RESET);

                Lienzo.ordenarImprimir(opc2, opc3);
                break;
            case 9:
                start = false;
                System.out.println(Dibujable.RED + "Fin del programa");
                Utilidades.linia(50);
                System.out.println();
                System.out.println(Dibujable.RED + "Georgi Georgiev");
                break;
            default:
                System.out.println(Dibujable.RED + "Opción no válida, vuelve a escribir una correcta" + Dibujable.RESET);
        }
    }


    //Metodos

    public static void ordenarImprimir(int tipo, int asc_desc)
    {
        switch (tipo)
        {
            case 1:
                //comparar area
                Collections.sort(figuras, Figura::compareTo);
                if (asc_desc == 2)
                {
                    Collections.reverse(figuras);
                }
                area();
                break;
            case 2:
                //comparar perimetro
                Collections.sort(figuras, Figura::comparePerimetro);
                if (asc_desc == 2)
                {
                    Collections.reverse(figuras);
                }
                perimetro();
                break;
            case 3:
                //compara distancia
                Collections.sort(figuras, Figura::compareDistancia);
                if (asc_desc == 2)
                {
                    Collections.reverse(figuras);
                }
                area();
                break;
            default:
                System.out.println(Dibujable.RED + "Opción no válida" + Dibujable.RESET);
        }
    }

    public static void Random()
    {
        String[] colors = {"rojo", "negro", "azul", "blanco", "amarillo", "verde"};
        for (int i = 0; i < 10; i++)
        {
            switch ((int) (Math.random() * 3))
            {
                case 0:
                    Triangulo t = new Triangulo(i, colors[(int) (Math.random() * 5)], colors[(int) (Math.random() * 5)], new Punto(Math.random() * 10, Math.random() * 10), Math.random() * 10, Math.random() * 10);
                    add(t);
                    break;
                case 1:
                    Cuadrado c = new Cuadrado(i, colors[(int) (Math.random() * 5)], colors[(int) (Math.random() * 5)], new Punto(Math.random() * 10, Math.random() * 10), Math.random() * 10);
                    add(c);
                    break;
                case 2:
                    Rectangulo r = new Rectangulo(i, colors[(int) (Math.random() * 5)], colors[(int) (Math.random() * 5)], new Punto(Math.random() * 10, Math.random() * 10), Math.random() * 10, Math.random() * 10);
                    add(r);
                    break;

                case 3:
                    Circulo cir = new Circulo(i, colors[(int) (Math.random() * 5)], colors[(int) (Math.random() * 5)], new Punto(Math.random() * 10, Math.random() * 10), Math.random() * 10);
                    add(cir);
                    break;
            }
        }

    }

    public static void dibujar()
    {
        Utilidades.linia(30);
        for (Figura f : figuras)
        {
            Utilidades.linia(30);
            f.dibujar();//dibujar todas las figuras
        }
        Utilidades.linia(30);
    }

    public static void area()
    {
        Utilidades.linia(30);
        for (Figura f : figuras)
        {
            f.area();//mostrar todas las areas
        }
        Utilidades.linia(30);
    }

    public static void perimetro()
    {
        for (Figura f : figuras)
        {
            f.perimetro();//perimetro de todas las figuras
        }
    }

    //Metodo para listar las figuras para el menu
    public static void listar()
    {
        System.out.println("Información de las figuras:");
        for (Figura figura : figuras)
        {
            System.out.println(figura);
        }
    }

    //Forma mas facil para encontrar una figura por su ID
    public static Figura buscarID(int id)
    {
        for (Figura figura : figuras)
        {
            if (figura.getId() == id)
            {
                return figura;
            }
        }
        //Si el resultado no existe daremos un mensaje
        Utilidades.linia(50);
        System.out.println(Dibujable.RED + "No se ha encontrado una figura con la ID." + Dibujable.RESET);
        System.out.println(Dibujable.RED + "No se ha encontrado una figura con la ID." + Dibujable.RESET);
        Utilidades.linia(50);
        return null;
    }

    //Calcular la distancia entre figuras
    public void distancia(int id)
    {
        Figura f = buscarID(id);
        if (f == null)
        {
            return;
        }
        for (Figura figura : figuras)
        {
            if (figura.getId() == id)
            {
                continue;
            }
            System.out.println(Dibujable.BLUE + "La distancia entre " + id + " y " + figura.getId() + " es " + figura.distancia(f) + Dibujable.RESET);
        }
    }

    public static void escalar(int id, int porcentaje)
    {
        Figura f = buscarID(id);
        if (f == null)
        {
            return;
        }
        f.escalar(porcentaje);
    }

    //Desplazamiento vertical
    public static void desplazarv(int id, double y)
    {
        Figura f = buscarID(id);
        if (f == null)
        {
            return;
        }
        f.desplazarv(y);
    }

    //Desplazamiento horizontal
    public static void desplazarh(int id, double x)
    {
        Figura f = buscarID(id);
        if (f == null)
        {
            return;
        }
        f.desplazarh(x);
    }

    public static void mover(int id, Punto p)
    {
        Figura f = buscarID(id);
        if (f == null)
        {
            return;
        }
        f.mover(p);
    }

    public static void add(Figura figura)
    {
        figuras.add(figura);
    }
}
