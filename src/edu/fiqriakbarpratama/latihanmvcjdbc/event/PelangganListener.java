/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fiqriakbarpratama.latihanmvcjdbc.event;

import edu.fiqriakbarpratama.latihanmvcjdbc.entity.Pelanggan;
import edu.fiqriakbarpratama.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author KoalaX
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1
 * 
 */
public interface PelangganListener {
    
    public void onChange (PelangganModel model);
    public void onInsert (Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate (Pelanggan pelanggan);
}
