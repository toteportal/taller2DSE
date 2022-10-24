/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.MedicosDao;
import modelo.entidad.Medicos;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class MedicosControl {

    /**
     * Creates a new instance of medicosControl
     */
    private List<Medicos> listaMedicos;
    private Medicos banco;

    public MedicosControl() {
        banco = new Medicos();
    }

    public List<Medicos> getListaMedicos() {
        MedicosDao ad = new MedicosDao();
        listaMedicos = ad.listarMedicos();
        return listaMedicos;
    }

    public void setListaMedicos(List<Medicos> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public Medicos getMedicos() {
        return banco;
    }

    public void setMedicos(Medicos banco) {
        this.banco = banco;
    }

    public void limpiarMedicos() {
        banco = new Medicos();
    }

    public void agregarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.agregar(banco);
    }

    public void modificarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.modificar(banco);
        limpiarMedicos();
    }

    public void eliminarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.eliminar(banco);
        limpiarMedicos();
    }
}
