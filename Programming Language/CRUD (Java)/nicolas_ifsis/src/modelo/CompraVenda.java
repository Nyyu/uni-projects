package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraVenda {
    int id;
    String operacao;
    int cliente_id;
    int formaPagamento;
    Double desconto;
    Date dataCadastro;
    private List<CompraVendaProduto> produtos;

    
    public List<CompraVendaProduto> getProdutos() {
        return produtos;
    }

    public void addProdutos(CompraVendaProduto p) {
        if (this.produtos == null) {
            this.produtos = new ArrayList<>();
        }
        this.produtos.add(p);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente(int cliente) {
        this.cliente_id = cliente;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
