/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballstats.model.domain;

/**
 *
 * @author lucas.motta
 */
class Estado {

    private int codigo;
    private String nome;
    private String abreviacao;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the abreviacao
     */
    public String getAbreviacao() {
        return abreviacao;
    }

    /**
     * @param abreviacao the abreviacao to set
     */
    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
    
}
