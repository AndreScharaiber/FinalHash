public class HashDobramento {
    public int Indice(int k, int m) {
        int x = 1000;
        int dobramento = 0;

        while (k > 0) {
            dobramento += k % x;
            k = k / x;
        }
        return dobramento % m;
    }
}