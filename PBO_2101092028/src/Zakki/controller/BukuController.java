/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki.controller;

import Zakki.DAO.BukuDao;
import Zakki.DAO.BukuDaoImp1;
import Zakki.model.Buku;
import Zakki.view.FormBuku;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BukuController {
    private FormBuku formBuku;
    private BukuDao bukuDao;
    private Buku buku;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImp1();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtTahunTerbit().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> listBuku = bukuDao.getAllBuku();
        for(Buku buku : listBuku){
            Object[] data={
                buku.getKodeBuku(),
                buku.getJudulBuku(),
                buku.getPengarang(),
                buku.getTahunTerbit()
            };
            tabelModel.addRow(data);
        }
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudulBuku().setText(buku.getJudulBuku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtTahunTerbit().setText(buku.getTahunTerbit());
        }
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setTahunTerbit(formBuku.getTxtTahunTerbit().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Entri Data Ok!");
    }    
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Delete Ok!");
    }
    
    public void UpdateBuku() {
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setTahunTerbit(formBuku.getTxtTahunTerbit().getText());
        bukuDao.update(index, buku);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Update Ok!");
    }
}
