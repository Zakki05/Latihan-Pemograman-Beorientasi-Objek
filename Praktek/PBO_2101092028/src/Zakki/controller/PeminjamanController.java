/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki.controller;

import Zakki.DAO.AnggotaDao;
import Zakki.DAO.AnggotaDaoImp1;
import Zakki.model.Anggota;
import Zakki.DAO.BukuDao;
import Zakki.DAO.BukuDaoImp1;
import Zakki.model.Buku;
import Zakki.DAO.PeminjamanDao;
import Zakki.DAO.PeminjamanDaoImp1;
import Zakki.model.Peminjaman;
import Zakki.view.FormPeminjaman;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 * 
 * 
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaoImp1();
        peminjamanDao = new PeminjamanDaoImp1();
    }
    
    public void setCboNoBp(){
        formPeminjaman.getCboNoBp().removeAllItems();
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list){
            formPeminjaman.getCboNoBp().addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    
    public void setCboBuku(){
        formPeminjaman.getCboBuku().removeAllItems();
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            formPeminjaman.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTanggalPinjam().setText("");
        formPeminjaman.getTxtTanggalKembali().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : listPeminjaman){
            Object[] data={
                peminjaman.getNoBp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTanggalPinjam(),
                peminjaman.getTanggalKembali()
            };
            tabelModel.addRow(data);
        }
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for(Anggota anggota:listAnggota){
                if(peminjaman.getNoBp()==anggota.getNobp()){
                    formPeminjaman.getCboNoBp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTanggalPinjam().setText(peminjaman.getTanggalPinjam());
            formPeminjaman.getTxtTanggalKembali().setText(peminjaman.getTanggalKembali());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNoBp(formPeminjaman.getCboNoBp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku(formPeminjaman.getCboBuku().getSelectedItem().toString());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok!");
    }    
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete Ok!");
    }
    
    public void UpdatePeminjaman() {
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setNoBp(formPeminjaman.getCboNoBp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku(formPeminjaman.getCboBuku().getSelectedItem().toString());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update Ok!");
    }
}
