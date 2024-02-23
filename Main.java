package hashing;
public class TabelaHashComPorao implements EstruturaDeDados {
    private LinkedList<Integer>[] tabela;
    private int tamanho;
    private LinkedList<Integer> porao;

    public TabelaHashComPorao() {
        tamanho = 1011;
        tabela = new LinkedList[tamanho];
        porao = new LinkedList<>();
    }

    private int hash(int chave) {
        return chave % tamanho;
    }
}
