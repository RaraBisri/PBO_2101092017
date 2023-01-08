/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rarabisri.controller;
import java.util.List;
import javax.swing.JOptionPane;
import rarabisri.view.*;
import rarabisri.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtnobp().setText("");
        formAnggota.getTxtnama().setText("");
        formAnggota.getTxtalamat().setText("");
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtnobp().getText());
        anggota.setNama(formAnggota.getTxtnama().getText());
        anggota.setAlamat(formAnggota.getTxtalamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "insert Ok");
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setNobp(formAnggota.getTxtnobp().getText());
        anggota.setNama(formAnggota.getTxtnama().getText());
        anggota.setAlamat(formAnggota.getTxtalamat().getText());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update Ok");
    }
    
     public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
      
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota, "Delete Ok");
    }
           
    public void tampil (){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota
                .getTblAnggota().getModel();
        tabelModel.setNumRows(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list) {
            Object[] row = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtnobp().setText(anggota.getNobp());
            formAnggota.getTxtnama().setText(anggota.getNama());
            formAnggota.getTxtalamat().setText(anggota.getAlamat());
        }
    }
}
