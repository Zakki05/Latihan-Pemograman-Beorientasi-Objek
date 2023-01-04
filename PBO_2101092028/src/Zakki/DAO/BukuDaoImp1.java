/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki.DAO;
import Zakki.model.Buku;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */

public class BukuDaoImp1 implements BukuDao{
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImp1(){
        data.add(new Buku("B001", "Zakki", "Rifki", "Rifki"));
        data.add(new Buku("B002", "Andre", "Rifki", "Rifki"));
        data.add(new Buku("B003", "Fajri", "Rifki", "Rifki"));
    }
    
    @Override
    public Buku save(Buku buku){
        data.add(buku);
        return buku;
    }
    
    public Buku update(int index, Buku buku){
        data.set(index, buku);
        return buku;
    }
    
    public Buku delete(int index){
        return data.remove(index);
    }
    
    public Buku getBuku (int index){
        return data.get(index);
    }
    
    public List<Buku> getAllBuku(){
        return data;
    }
}
