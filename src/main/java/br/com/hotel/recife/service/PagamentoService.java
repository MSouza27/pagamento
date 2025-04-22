package br.com.hotel.recife.service;

import br.com.hotel.recife.model.Pagamento;
import br.com.hotel.recife.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento cadastrar(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }
}
