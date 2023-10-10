import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, String descricao, double valor, boolean disponivelParaVenda) {
        Produto produto = new Produto(nome, descricao, valor, disponivelParaVenda);
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void listarProdutos() {
        produtos.sort(Comparator.comparingDouble(Produto::getValor));
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
