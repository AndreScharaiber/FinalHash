public class Hash {
    int m;
    int m1 = 1009;
    int m2 = 10007;
    int m3 = 100003;
    int n1 = 1000;
    int n2 = 10000;
    int n3 = 100000;
    int s1 = 137;
    int s2 = 271828;
    int s3 = 314159;
    Nodo[] hash;
    long ColTabela = 0;
    long ColLista  = 0;
    long CmpHits = 0;
    long CmpMiss = 0;

    public Hash(int m) {
        this.m = m;
        Nodo[] hash = new Nodo[m];
        this.hash = hash;
        this.ColLista = ColLista;
        this.ColTabela = ColTabela;
        this.CmpHits = CmpHits;
        this.CmpMiss = CmpMiss;
    }

    public long getColTabela() { return this.ColTabela; }
    public long getColLista() { return this.ColLista; }

    public void Insere(int k, String funcao) {
        int Indice = 0;

        if (funcao.equals("DIV")) {
            HashDivisao HashDiv = new HashDivisao();
            Indice = HashDiv.Indice(k, m);
        } else if (funcao.equals("MUL")) {
            HashMultiplicacao HashMul = new HashMultiplicacao();
            Indice = HashMul.Indice(k, m);
        } else if (funcao.equals("DOB")) {
            HashDobramento HashDob = new HashDobramento();
            Indice = HashDob.Indice(k, m);
        }

        int Percorrido = 0;

        if (hash[Indice] == null) {
            Nodo NovoNodo = new Nodo(k);
            hash[Indice] = NovoNodo;
        } else {
            Nodo Atual = hash[Indice];
            ColTabela = ColTabela + 1;

            while (Atual.Proxima() != null) {
                Atual = Atual.Proxima();
                Percorrido = Percorrido + 1;
            }
            Nodo NovoNodo = new Nodo(k);
            Atual.Proxima(NovoNodo);
            ColLista = ColLista + Percorrido;
        }
    }

    public Nodo Busca(int k, String funcao) {
        int Indice = 0;

        if (funcao.equals("DIV")) {
            HashDivisao HashDiv = new HashDivisao();
            Indice = HashDiv.Indice(k, m);
        } else if (funcao.equals("MUL")) {
            HashMultiplicacao HashMul = new HashMultiplicacao();
            Indice = HashMul.Indice(k, m);
        } else if (funcao.equals("DOB")) {
            HashDobramento HashDob = new HashDobramento();
            Indice = HashDob.Indice(k, m);
        }

        Nodo Atual = hash[Indice];

        while (Atual != null) {
            if (Atual.Chave() == k) {
                CmpHits++;
                return Atual;
            }
            CmpMiss++;
            Atual = Atual.Proxima();
        }
        CmpMiss++;
        return null;
    }
}
