// Clase para testear el funcionamiento de las demas clases

public class GeometriaAbstracta {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(1);
        figuras[1] = new Rectangulo(2, 3);
        figuras[2] = new Triangulo(3, 4, 5);

        for (Figura figura : figuras) {

            if (figura instanceof Circulo) {
                System.out.println("CIRCULO\n");
            } else if (figura instanceof Rectangulo) {
                System.out.println("RECTANGULO\n");
            } else if (figura instanceof Triangulo) {
                System.out.println("TRIANGULO\n");
            }

            // Imprime los valores del area y perimetro de la figura
            System.out.println("El area de la figura es: " + figura.calcularArea());
            System.out.println("El perimetro de la figura es: " + figura.calcularPerimetro());

            System.out.println();

            // Dibuja la figura
            if (figura instanceof Circulo circulo) {
                circulo.dibujar();
            } else if (figura instanceof Rectangulo rectangulo) {
                rectangulo.dibujar();
            } else if (figura instanceof Triangulo triangulo) {
                triangulo.dibujar();
            }

        }
    }
}
