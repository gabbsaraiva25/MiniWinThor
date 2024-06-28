import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Boolean continuar;

        do {
            Produto produto = new Produto();

            System.out.println("Insira o código");
            String codigo = leia.next();
            produto.setCodigo(codigo);

            System.out.println("Insira a descrição");
            String descricao = leia.nextLine();
            produto.setDescricao(descricao);

            System.out.println("Insira o preço de compra");
            double precoDeCompra = leia.nextDouble();
            produto.setPreco_de_compra(precoDeCompra);

            System.out.println("Insira o preço de venda");
            double precoDeVenda = leia.nextDouble();
            produto.setPreco_de_venda(precoDeVenda);

            System.out.println("Insira o Status");
            boolean status = leia.hasNextBoolean();
            produto.setStatus_do_produto(status);

            listaDeProdutos.add(produto);

            System.out.println();
            System.out.println("Você deseja continuar? Digite sim");
            String resposta = leia.nextLine();

            if (resposta.equals("sim")) {
                continuar = true;
            } else {
                continuar = false;
            }

        } while (continuar);

        for (int posicao = 0; posicao < listaDeProdutos.size(); posicao++) {
            System.out.println(listaDeProdutos.get(posicao));
        }
    }
}