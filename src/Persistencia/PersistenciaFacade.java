/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import Banco.BancoException;
import Java.io.File;
import Banco.Conta;


/**
 *
 * @author diegotxr
 */
public class PersistenciaFacade {

    private File arquivo;

    public Double selecionarSaldo(Conta conta) throws PersistenciaException, BancoException {
        return conta.getSaldo();
    }
}
