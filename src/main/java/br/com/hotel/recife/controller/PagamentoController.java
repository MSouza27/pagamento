package br.com.hotel.recife.controller;

import br.com.hotel.recife.model.Pagamento;
import br.com.hotel.recife.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Pagamento> salvar(@RequestBody Pagamento pagamento){
        var dados = pagamentoService.cadastrar(pagamento);
        return ResponseEntity.status(201).body(dados);
    }
}
