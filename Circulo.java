public class Circulo extends Figura implements Dibujable {

    // Atributos
    private int radio;

    // Constructores
    public Circulo(int radio) {
        this.radio = radio;
    }

    // implementar mis métodos abstractos
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    // implemento el metodo de la interfaz

    @Override
    public void dibujar() {

        for (int y = -radio; y <= radio; y++) {
            for (int x = -radio; x <= radio; x++) {
                // Use the circle equation x^2 + y^2 <= r^2
                if (x * x + y * y <= radio * radio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}