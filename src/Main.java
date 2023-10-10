public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();

        // Adicionando alguns produtos
        cadastro.adicionarProduto("Produto A", "Descrição do Produto A", 100.0, true);
        cadastro.adicionarProduto("Produto B", "Descrição do Produto B", 50.0, false);
        cadastro.adicionarProduto("Produto C", "Descrição do Produto C", 75.0, true);

        // Listando os produtos
        System.out.println("Lista de produtos:");
        cadastro.listarProdutos();
    }
}
