/*package com.sesi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.dto.PedidoDto;
import com.sesi.projeto.entities.Pedido;
import com.sesi.projeto.repository.PedidoRepository;

@RestController
@RequestMapping(value = "pagamento")
public class PedidoController {

    @Autowired
    PedidoRepository repo;

    @PostMapping("/cadastrar")
    public ResponseEntity<Pedido> registrarProduto(@RequestBody PedidoDto dto) {
        Pedido ped = new Pedido(dto);
        return ResponseEntity.ok(ped);
    }

	
	@DeleteMapping(value = "/delete/{id}")
	public String deletarProduto(Long id) {
		repo.deleteById(id);
		return"Produto deletado com sucesso!";
	}
	
	@PutMapping(value = "/atualizar/{id}")
	public Pedido updateUsuario(Long id, Pedido pedidoAtualizado) {
		Pedido ped = repo.findById(id).get();
		ped.setMomento(pedidoAtualizado.getMomento());
		ped.setStatus(pedidoAtualizado.getStatus());
		
		return repo.save(ped);
	}
}*/
