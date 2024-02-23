package hashing;

import java.util.LinkedList;

public class HashingComPorao implements EstruturaDeDados{

    @Override
    public void insert(int chave) {
        int indice = hash(chave);
        if (tabela[indice] == null) {
            tabela[indice] = new LinkedList<>();
        }
        tabela[indice].add(chave);
    }

    @Override
    public void delete(int chave) {
        int indice = hash(chave);
        if (tabela[indice] != null) {
            tabela[indice].remove(Integer.valueOf(chave));
        } else {
            porao.remove(Integer.valueOf(chave));
        }
    }

    @Override
    public boolean search(int chave) {
        int indice = hash(chave);
        if (tabela[indice] != null && tabela[indice].contains(chave)) {
            return true;
        } else {
            return porao.contains(chave);
        }
    }
    
}
