import java.util.Scanner;

public class Ex23 {
    public Ex23() {
        Scanner s = new Scanner(System.in);

        double valorTotal = 0;
        double valorProdutoTotal = 0;
        double salario = 0;

        while (true) {
            System.out.println("Informe o nome do funcionário: ");
            String nome = s.next();
            System.out.println("Quantos produtos diferentes foram vendidos");
            int quantidade = s.nextInt();
            int i = 0;

            while (i < quantidade) {

                i++;

                System.out.println("Informe a quantidade de produtos vendidos");
                double quantidadeProdutos = s.nextDouble();
                System.out.println("Informe o valor do produto");
                double valorProduto = s.nextDouble();

                valorProdutoTotal = quantidadeProdutos * valorProduto;

                valorTotal += valorProdutoTotal;
            }

            salario = valorTotal * 0.3;

            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Total de vendas do funcionário: R$" + valorTotal);
            System.out.println("Salário do funcionário: R$" + salario);

            System.out.println("Deseja digitar os dados de mais um vendedor?\ns para SIM / n para NÃO");
            String escolha = s.next();
            char escolhaA = escolha.toUpperCase().charAt(0);

            if (escolhaA == 'N') {
                break;
            }

            valorTotal = 0;
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex23();
    }
}