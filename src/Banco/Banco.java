package Banco;

import java.util.HashMap;
import java.util.Map;
import Persistencia.PersistenciaFacade;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diegotxr
 */
public class Banco {

    private Map<String, Conta> contas = new HashMap<String, Conta>();

    public Conta getConta(String numero) {
        return contas.get(numero);
    }
}
