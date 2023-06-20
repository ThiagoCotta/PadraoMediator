import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarAtendimentoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("Os correios agradecem o seu contato.\n" +
                        "Nosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>Nosso Atendimento ao Cliente  agradece a mensagem: Fui atendido rápidamente e meu problema foi solucionado",
                cliente.elogiarAtendimentoCliente("Fui atendido rápidamente e meu problema foi solucionado"));
    }

    @Test
    void deveReclamarAtendimentoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("Os correios agradecem o seu contato.\nNosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>Nosso Atendimento ao Cliente vai procurar melhorar o serviço da reclamação: Não atendeu as espectativas, preciso fazer a devolução e não tive respostas",
                cliente.reclamarAtendimentoCliente("Não atendeu as espectativas, preciso fazer a devolução e não tive respostas"));
    }

    @Test
    void deveSugerirAtendimentoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("Os correios agradecem o seu contato.\nNosso Atendimento ao Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>Nosso Atendimento ao Cliente vai analisar a sugestão: Adicionar principais tópicos de dúvidas recorrentes no ChatBot",
                cliente.sugerirAtendimentoCliente("Adicionar principais tópicos de dúvidas recorrentes no ChatBot"));
    }

}