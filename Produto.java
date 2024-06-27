public class Produto {

    private String Codigo;
    private String Descricao;
    private double Preco_de_compra;
    private double Preco_de_venda;
    private boolean Status_do_produto;


    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getPreco_de_compra() {
        return Preco_de_compra;
    }

    public void setPreco_de_compra(double preco_de_compra) {
        Preco_de_compra = preco_de_compra;
    }

    public void setPreco_de_venda(double preco_de_venda) {
        Preco_de_venda = preco_de_venda;
    }

    public double getPreco_de_venda() {
        return Preco_de_venda;
    }

    public void setStatus_do_produto(boolean status_do_produto) {
        Status_do_produto = status_do_produto;
    }

    public boolean isStatus_do_produto() {
        return Status_do_produto;
    }
}
