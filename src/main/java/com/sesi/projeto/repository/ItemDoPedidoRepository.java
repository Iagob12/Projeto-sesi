package com.sesi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.entities.ItemDoPedido;

@Repository
public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, Long>{

}
