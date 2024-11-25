public class Triangulo extends Figura implements Dibujable{

    // Atributos
    private int lado1;
    private int lado2;
    private int lado3;

    // Constructores
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        //utilizando la formula de heron hallamos área
        double s = (lado1 + lado2 + lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public void dibujar() {
        // TODO Auto-generated method stub
        System.out.println("Triangulo dibujado");
    }

    //metodos interfaz
    
    
}