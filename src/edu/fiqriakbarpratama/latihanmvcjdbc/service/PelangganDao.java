/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fiqriakbarpratama.latihanmvcjdbc.service;

import edu.fiqriakbarpratama.latihanmvcjdbc.entity.Pelanggan;
import edu.fiqriakbarpratama.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KoalaX
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1
 * 
 */
public interface PelangganDao {
    
    public void insertPelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan () throws PelangganException;
    
    
    
    
}
