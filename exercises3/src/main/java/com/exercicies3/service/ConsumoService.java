package com.exercicies3.service;

import com.exercicies3.domain.Consumo;
import com.exercicies3.domain.Produto;

public class ConsumoService {
    
    private Consumo consumo;

    public ConsumoService(String nomeCliente){
        consumo = new Consumo(nomeCliente);
    }

    public void addProdutos(String nomeProduto, double precoProduto, int quantidadeProduto){
        consumo.addProdutosConsumidos(new Produto(nomeProduto, precoProduto, quantidadeProduto));
    }

    public void calculaValorTotalConsumo(){
        double sum = 0;
        for(Produto produto : consumo.getProdutosConsumidos()){
            sum += produto.getPrecoProduto() * produto.getQuantidadeProduto();
        }
        consumo.setValorTotalConsumo(sum);
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public void imprimirConsumo(){
        System.out.println("----------CONTA FECHADA----------");
        System.out.println("Conta Fechada: " + consumo.getNomeCliente());
        for(Produto produto : consumo.getProdutosConsumidos()){
            System.out.println("Nome: " + produto.getNomeProduto() + " | Qnt: " + produto.getQuantidadeProduto() + " | Preço: R$" + produto.getPrecoProduto() );
        }
        System.out.println("\nValor Total: R$" + consumo.getValorTotalConsumo());
    }
  
}
