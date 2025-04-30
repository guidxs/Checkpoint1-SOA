package br.com.fiap.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String getProdutoPorId(String produto) {
        String dado = "Produto encontrado: " + produto; // Simulando o repository
        return dado;
    }

}
