package com.algaworks.algafood.di.notificacao;

import com.samuel.samsfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}