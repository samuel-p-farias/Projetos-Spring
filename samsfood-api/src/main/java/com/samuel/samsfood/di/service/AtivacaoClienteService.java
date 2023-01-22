package com.samuel.samsfood.di.service;

import com.samuel.samsfood.di.modelo.Cliente;
import com.samuel.samsfood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;
    @Autowired
    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;

    }
    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}
