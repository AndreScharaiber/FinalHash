public class Nodo {

    private int chave;
    private Nodo proximo;

    public Nodo(int chave) {
        this.chave = chave;
        this.proximo = null;
    }

    public int Chave() {
        return this.chave;
    }

    public Nodo Proxima() {
        return this.proximo;
    }

    public void Proxima(Nodo n) {
        this.proximo = n;
    }
}
