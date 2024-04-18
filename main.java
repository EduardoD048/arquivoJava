import CadastroCliente.cadastroCliente;
import CadastroPedido.cadastroPedido;
import GerarRelatorioVenda.gerarRelatorioVenda;
import GerarRelatorioEstoque.gerarRelatorioEstoque;

class main {
    public static void main(String[] args) {
         
         cadastroCliente cadastroCliente = new cadastroCliente();
         cadastroPedido cadastroPedido = new cadastroPedido();
         gerarRelatorioVenda gerarRelatorioVenda = new gerarRelatorioVenda();
         gerarRelatorioEstoque gerarRelatorioEstoque = new gerarRelatorioEstoque();
    }
}