/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratih.DAO;

import ratih.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MahasiswaDaoImp1 implements ratih.DAO.MahasiswaDao{
    List<Mahasiswa> data = new ArrayList<>();

    @Override
    public Mahasiswa save(Mahasiswa mahasiswa){
        data.add(mahasiswa);
        return mahasiswa;
    }

    public Mahasiswa update(int index, Mahasiswa mahasiswa){
        data.set(index, mahasiswa);
        return mahasiswa;
    }

    public boolean delete(Mahasiswa mahasiswa){
        return data.remove(mahasiswa);
    }

    public Mahasiswa getMahasiswa (int index){
        return data.get(index);
    }

    public List<Mahasiswa> getAllMahasiswa(){
        return data;
    }
}
