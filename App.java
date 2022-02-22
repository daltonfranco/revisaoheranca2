public class App {
    
    public static void main(String[] args){

        Novo imovelNovo = new Novo();

        imovelNovo.setEndereco("Tupa");
        imovelNovo.setPreco(100000.00);
        imovelNovo.setAdicional(1000.00);

        System.out.println(imovelNovo.getEndereco());
        System.out.println(imovelNovo.getPreco());
        System.out.println(imovelNovo.getAdicional());
        double valorImovelNovo = imovelNovo.getAdicional() + imovelNovo.getPreco();

        System.out.println("O valor do imovel é " + valorImovelNovo + " reais");

        System.out.println("--------------------------------------------------------------------------------");



        Velho imovelVelho = new Velho();

        imovelVelho.setEndereco("Tupa");
        imovelVelho.setPreco(1000);
        imovelVelho.setDesconto(imovelVelho.getPreco()*10/100);

        double valorImovelVelho = imovelVelho.getPreco() - imovelVelho.getDesconto();

        System.out.println(valorImovelVelho);
    }

}
