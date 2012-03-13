/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Persistencia.PersistenciaFacade;

/**
 *
 * @author diegotxr
 */
public class Conta {

    public PersistenciaFacade persistencia;
    private String numero;
    private Double saldo;

    public Conta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    Conta() {
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() throws BancoException {
        return this.saldo;
    }
}
