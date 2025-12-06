import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hash valores = new Hash(0);

        int[] tamanhos = {valores.m1, valores.m2, valores.m3};
        int[] datasets = {valores.n1, valores.n2, valores.n3};
        int[] seeds = {valores.s1, valores.s2, valores.s3};
        String[] funcoes = {"DIV", "MUL", "DOB"};

        int total = 0;
        for (int M = 0; M < 3; M++) {
            for (int N = 0; N < 3; N++) {
                for (int Hash = 0; Hash < 3; Hash++) {
                    total++;
                    int m = tamanhos[M];
                    int n = datasets[N];
                    int seed = seeds[Hash];
                    String func = funcoes[Hash];
                    Hash tabela = new Hash(m);
                    Random rand = new Random(seed);

                    int[] dados = new int[n];
                    int i = 0;
                    while (i < n) {
                        dados[i] = 100000000 + rand.nextInt(999999999);
                        i++;
                    }

                    long Insere = System.nanoTime();
                    int j = 0;
                    while (j < n) {
                        tabela.Insere(dados[j], func);
                        j++;
                    }
                    long InsereFim = System.nanoTime();
                    Random randBusca = new Random(seed + 1);
                    int[] busca = new int[n];
                    int k = 0;
                    while (k < n) {
                        if (k % 2 == 0) busca[k] = dados[k];
                        else busca[k] = 100000000 + randBusca.nextInt(999999999);
                        k++;
                    }

                    long Busca = System.nanoTime();
                    int l = 0;
                    while (l < n) {
                        tabela.Busca(busca[l], func);
                        l++;
                    }
                    long BuscaFim = System.nanoTime();
                    long checksum = 0;
                    HashDivisao hd = new HashDivisao();
                    int limite = n < 10 ? n : 10;
                    int c2 = 0;
                    while (c2 < limite) {
                        checksum += hd.Indice(dados[c2], m);
                        c2++;
                    }
                    checksum %= 1000003;
                    System.out.println("Experimento " + total);
                    System.out.println("Tamanho tabela: " + m);
                    System.out.println("Dataset: " + n);
                    System.out.println("Função hash: " + func);
                    System.out.println("Seed: " + seed);
                    System.out.println("Colisões tabela: " + tabela.getColTabela());
                    System.out.println("Colisões lista: " + tabela.getColLista());
                    System.out.println("Acertos: " + tabela.CmpHits);
                    System.out.println("Erros: " + tabela.CmpMiss);
                    System.out.println("Tempo inserção: " + ((InsereFim - Insere)/1000000));
                    System.out.println("Tempo busca: " + ((BuscaFim - Busca)/1000000));
                    System.out.println("Checksum: " + checksum);
                    System.out.println(" ");
                }
            }
        }
    }
}
