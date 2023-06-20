public class Pessoa {

    public String elogiarAtendimentoCliente(String mensagem) {
        return ChatBot.getInstancia().receberElogioAtendimentoCliente(mensagem);
    }

    public String reclamarAtendimentoCliente(String mensagem) {
        return ChatBot.getInstancia().receberReclamacaoAtendimentoCliente(mensagem);
    }

    public String sugerirAtendimentoCliente(String mensagem) {
        return ChatBot.getInstancia().receberSugestaoAtendimentoCliente(mensagem);
    }


}
