/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.PersistenciaPessoa;
import java.util.ArrayList;



/**
 *
 * @author BR0004481361
 */
public class Pessoa{
    
    private String pes_iden;
    private String pes_funcao;
    private String pes_nome;
    private String pes_logradouro;
    private String pes_cep;
    private String pes_numero;
    private String pes_complemento;
    private String pes_bairro;
    private String pes_cidade;
    private String pes_uf;
    private String pes_telCelular;
    private String pes_telResidencial;
    
    
    public Pessoa(){}
    public Pessoa(String pes_iden, String pes_funcao, String pes_nome, String pes_logradouro, String pes_cep, String pes_numero, String pes_complemento, String pes_bairro, String pes_cidade, String pes_uf, String pes_telCelular, String pes_telResidencial) {
        this.pes_iden = pes_iden;
        this.pes_funcao = pes_funcao;
        this.pes_nome = pes_nome;
        this.pes_logradouro = pes_logradouro;
        this.pes_cep = pes_cep;
        this.pes_numero = pes_numero;
        this.pes_complemento = pes_complemento;
        this.pes_bairro = pes_bairro;
        this.pes_cidade = pes_cidade;
        this.pes_uf = pes_uf;
        this.pes_telCelular = pes_telCelular;
        this.pes_telResidencial = pes_telResidencial;
    }

    public static ArrayList<Pessoa> ListarPessoas(String sql)
    {
        // retorna todas as contas cadastradas
        return PersistenciaPessoa.ListaPessoas(sql);
    }
    
    public static boolean CadastrarPessoa(String pes_iden, String pes_funcao, String pes_nome, String pes_logradouro, String pes_cep, String pes_numero, String pes_complemento, String pes_bairro, String pes_cidade, String pes_uf, String pes_telCelular, String pes_telResidencial)
    {
        Pessoa pessoa = new Pessoa(pes_iden, pes_funcao, pes_nome, pes_logradouro, pes_cep, pes_numero, pes_complemento, pes_bairro, pes_cidade, pes_uf, pes_telCelular, pes_telResidencial);
        return PersistenciaPessoa.CadastraPessoa(pessoa);
    }
    
    public static boolean AlterarPessoa(String pes_iden, String pes_funcao, String pes_nome, String pes_logradouro, String pes_cep, String pes_numero, String pes_complemento, String pes_bairro, String pes_cidade, String pes_uf, String pes_telCelular, String pes_telResidencial)
    {
        Pessoa pessoa = new Pessoa(pes_iden, pes_funcao, pes_nome, pes_logradouro, pes_cep, pes_numero, pes_complemento, pes_bairro, pes_cidade, pes_uf, pes_telCelular, pes_telResidencial);
        return PersistenciaPessoa.AlteraPessoa(pessoa);
    }
    
    
    public String getPes_iden() {
        return pes_iden;
    }

    /**
     * @param pes_iden the pes_iden to set
     */
    public void setPes_iden(String pes_iden) {
        this.pes_iden = pes_iden;
    }

    /**
     * @return the pes_funcao
     */
    public String getPes_funcao() {
        return pes_funcao;
    }

    /**
     * @param pes_funcao the pes_funcao to set
     */
    public void setPes_funcao(String pes_funcao) {
        this.pes_funcao = pes_funcao;
    }

    /**
     * @return the pes_nome
     */
    public String getPes_nome() {
        return pes_nome;
    }

    /**
     * @param pes_nome the pes_nome to set
     */
    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    /**
     * @return the pes_logradouro
     */
    public String getPes_logradouro() {
        return pes_logradouro;
    }

    /**
     * @param pes_logradouro the pes_logradouro to set
     */
    public void setPes_logradouro(String pes_logradouro) {
        this.pes_logradouro = pes_logradouro;
    }

    /**
     * @return the pes_cep
     */
    public String getPes_cep() {
        return pes_cep;
    }

    /**
     * @param pes_cep the pes_cep to set
     */
    public void setPes_cep(String pes_cep) {
        this.pes_cep = pes_cep;
    }

    /**
     * @return the pes_numero
     */
    public String getPes_numero() {
        return pes_numero;
    }

    /**
     * @param pes_numero the pes_numero to set
     */
    public void setPes_numero(String pes_numero) {
        this.pes_numero = pes_numero;
    }

    /**
     * @return the pes_complemento
     */
    public String getPes_complemento() {
        return pes_complemento;
    }

    /**
     * @param pes_complemento the pes_complemento to set
     */
    public void setPes_complemento(String pes_complemento) {
        this.pes_complemento = pes_complemento;
    }

    /**
     * @return the pes_bairro
     */
    public String getPes_bairro() {
        return pes_bairro;
    }

    /**
     * @param pes_bairro the pes_bairro to set
     */
    public void setPes_bairro(String pes_bairro) {
        this.pes_bairro = pes_bairro;
    }

    /**
     * @return the pes_cidade
     */
    public String getPes_cidade() {
        return pes_cidade;
    }

    /**
     * @param pes_cidade the pes_cidade to set
     */
    public void setPes_cidade(String pes_cidade) {
        this.pes_cidade = pes_cidade;
    }

    /**
     * @return the pes_uf
     */
    public String getPes_uf() {
        return pes_uf;
    }

    /**
     * @param pes_uf the pes_uf to set
     */
    public void setPes_uf(String pes_uf) {
        this.pes_uf = pes_uf;
    }

    /**
     * @return the pes_telCelular
     */
    public String getPes_telCelular() {
        return pes_telCelular;
    }

    /**
     * @param pes_telCelular the pes_telCelular to set
     */
    public void setPes_telCelular(String pes_telCelular) {
        this.pes_telCelular = pes_telCelular;
    }

    /**
     * @return the pes_telResidencial
     */
    public String getPes_telResidencial() {
        return pes_telResidencial;
    }

    /**
     * @param pes_telResidencial the pes_telResidencial to set
     */
    public void setPes_telResidencial(String pes_telResidencial) {
        this.pes_telResidencial = pes_telResidencial;
    }
    
    
       
}
