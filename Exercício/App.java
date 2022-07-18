public class App {
    public static void main(String[] args) throws Exception {
        Calculadora c = new Calculadora();
        c.ligar();
        c.somar();
        c.desligar();
        c.somar();
        c.subtrair();
        c.ligar();
        c.subtrair();
        c.multiplicar();
        c.dividir();
    }
}