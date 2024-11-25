public class Rectangulo extends Figura implements Dibujable{

    // Atributos
    private int base;
    private int altura;

    // Constructores
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //implemetar los metodos abtractos

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base)+(2*altura);
    }
    //implementar metodos de la interfaz

    @Override
    public void dibujar() {
        // for (int i = 0; i < base; i++) {
            
        // }
        System.out.println("Rectangulo dibujado");
    }
    
    
}