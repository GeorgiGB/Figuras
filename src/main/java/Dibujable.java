public interface Dibujable
{
    //Atributos
    void dibujar();
    void rellenar();

    //Colores
    static final String RED = "\033[0;31m";     // Rojo
    static final String GREEN = "\033[0;32m";   // Verde
    static final String BLUE = "\033[0;34m";    // Azul
    static final String YELLOW = "\033[0;33m";  // Amarillo
    static final String BLACK = "\033[0;30m";   // Negro
    static final String WHITE = "\033[0;37m";   // Blanco
    static final String RESET = "\033[0m";  // Reseteo de texto
}
