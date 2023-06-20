public class AtendimentoCliente implements Setor {

    private static AtendimentoCliente instancia = new AtendimentoCliente();

    private AtendimentoCliente() {}

    public static AtendimentoCliente getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "Nosso Atendimento ao Cliente vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "Nosso Atendimento ao Cliente  agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "Nosso Atendimento ao Cliente vai analisar a sugestão: " + mensagem;
    }
}
