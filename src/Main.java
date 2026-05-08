import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> mapaProdutos = new HashMap<>();

        System.out.println("Quantos produtos deseja cadastrar?");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            String nome = sc.nextLine();


            System.out.println("Digite  preço do produto " + nome + ":");
            double preco = sc.nextDouble();

            sc.nextLine();

            mapaProdutos.put(nome, preco);
        }

        System.out.println("produtos Cadastrados:");
        for (Map.Entry<String, Double> entrada : mapaProdutos.entrySet()) {
            System.out.println("Produto: " + entrada.getKey() + " Preço: " + entrada.getValue());

        }

        System.out.println("------------------ Registro de Vendas -----------------------");
        System.out.println("Digite o nome do produto vendido:");
        String busca = sc.nextLine();

        System.out.println("Digite a quantidade: ");
        String buscaQuantidade = sc.nextLine();

        if (mapaProdutos.containsKey(busca)) {
            double precoVenda = mapaProdutos.get(busca);
            System.out.println("Venda efetivada com sucesso! Produto: " + busca + " Valor: R$ " + precoVenda);
        } else {
            System.out.println("Erro: Produto " + busca + " 'não encontrado em nosso estoque!");
        }

        if (mapaProdutos.containsKey(buscaQuantidade)) {
            System.out.println("Quantiade registrada com sucesso! " + buscaQuantidade );
        }
        sc.close();
    }
}