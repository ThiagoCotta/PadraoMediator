public class ChatBot {

    private static ChatBot instancia = new ChatBot();

    private ChatBot() {}

    public static ChatBot getInstancia() {
        return instancia;
    }

    public String receberElogioAtendimentoCliente(String mensagem) {
        return "Os correios agradecem o seu contato.\n"+
                "Nosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AtendimentoCliente.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoAtendimentoCliente(String mensagem) {
        return "Os correios agradecem o seu contato.\n"+
                "Nosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AtendimentoCliente.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAtendimentoCliente(String mensagem) {
        return "Os correios agradecem o seu contato.\n"+
                "Nosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AtendimentoCliente.getInstancia().receberSugestao(mensagem);
    }

}
