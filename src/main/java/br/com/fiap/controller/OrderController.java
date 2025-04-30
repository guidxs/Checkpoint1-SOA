package br.com.fiap.controller;

import br.com.fiap.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/produto/{nome}")
    public String getProduto(@RequestBody String nome) {
        return service.getProdutoPorId(nome);
    }

}
