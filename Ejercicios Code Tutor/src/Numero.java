public class Numero {
    int valor;
    boolean esPositivo;
    public Numero(int valor) {
        this.valor = valor;
        if (valor > 0) {
            this.esPositivo = true;
        } else {
            this.esPositivo = false;
        }
    }
    public void mostrarNumero() {
        System.out.println("Valor del numero ingresado: " + this.valor);
        this.imprimirPositivo();
    }
    public void imprimirPositivo() {
        if (esPositivo) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public static void main(String[] args) {
    Numero num = new Numero(4);
    num.mostrarNumero();
    }
}
