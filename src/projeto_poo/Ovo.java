/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_poo;

import java.util.Date;

/**
 *
 * @author viniciuslopes
 */
public class Ovo {
    
    private int id_ovo;
    private float valor_unidade;
    private int qtd_ovos;
    private Date data_producao;
    private LoteAves lote;

    public int getId_ovo() {
        return id_ovo;
    }

    public void setId_ovo(int id_ovo) {
        this.id_ovo = id_ovo;
    }

    public float getValor_unidade() {
        return valor_unidade;
    }

    public void setValor_unidade(float valor_unidade) {
        this.valor_unidade = valor_unidade;
    }

    public int getQtd_ovos() {
        return qtd_ovos;
    }

    public void setQtd_ovos(int qtd_ovos) {
        this.qtd_ovos = qtd_ovos;
    }

    public Date getData_producao() {
        return data_producao;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    public LoteAves getLote() {
        return lote;
    }

    public void setLote(LoteAves lote) {
        this.lote = lote;
    }
    
}
