package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class ItemDoPedido {

    @EmbeddedId
    private ItemDoPedidoPK id = new ItemDoPedidoPK();


    private Integer quantidade;
    private Double preco;

    public ItemDoPedido() {
    }

    public ItemDoPedido(Pedido pedido, Produto produto,Integer quantidade, Double preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
  
    public ItemDoPedidoPK getId() {
        return id;
    }

    public void setId(ItemDoPedidoPK id) {
        this.id = id;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Produto getProduto() {
    	return id.getProduto();
    }
}
