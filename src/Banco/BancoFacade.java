package Banco;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diegotxr
 */
public class BancoFacade {

    private Banco banco;

    Conta conta = new Conta();

    public BancoFacade(Banco banco) {
        this.banco = banco;
    }

    public Double getSaldo(String numero) throws BancoException {
        return this.banco.getConta(numero).getSaldo();
    }
}
