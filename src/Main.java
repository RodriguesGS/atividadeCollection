import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Map<Integer, Produto> produtos = new HashMap<>();

        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.println("==============");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionado!\n");
                    System.out.print("Digite o código do Produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do Produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do Produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Produto produto = new Produto(codigo, nome, preco);
                    produtos.put(codigo, produto);
                    break;

                case 2:
                    System.out.println("Opção de busca selecionada\n");
                    System.out.print("Digite o código do produto para busca: ");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine();

                    Produto produtoEncontrado = produtos.get(codigoBusca);
                    if (produtoEncontrado != null) {
                        System.out.println("\nProduto encontrado: " + produtoEncontrado);
                    } else {
                        System.out.println("Produto não cadastrado.");
                    }

                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}