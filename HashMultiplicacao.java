public class HashMultiplicacao {
    double a = 0.6180339887;

    public int Indice(int k, int m) {
        double multi = a * k;
        double reducao = multi - (int) multi;
        int valor = (int) (reducao * m);

        return valor;
    }
}