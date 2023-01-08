/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki.DAO;

import Zakki.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface MahasiswaDao {
    Mahasiswa save(Mahasiswa mahasiswa);
    Mahasiswa update(int index, Mahasiswa mahasiswa);
    boolean delete(Mahasiswa mahasiswa);
    Mahasiswa getMahasiswa(int index);
    List<Mahasiswa> getAllMahasiswa();
}
