/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fiqriakbarpratama.latihanmvcjdbc.model;

import edu.fiqriakbarpratama.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.fiqriakbarpratama.latihanmvcjdbc.entity.Pelanggan;
import edu.fiqriakbarpratama.latihanmvcjdbc.error.PelangganException;
import edu.fiqriakbarpratama.latihanmvcjdbc.event.PelangganListener;
import edu.fiqriakbarpratama.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author KoalaX
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1
 * 
 */
public class PelangganModel {

    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }

    }

    protected void fireOnInsert(Pelanggan pelanggan) {
        if (listener != null) {
            listener.onInsert(pelanggan);
        }

    }

    protected void fireOnUpdate(Pelanggan pelanggan) {
        if (listener != null) {
            listener.onUpdate(pelanggan);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public void insertPelanggan() throws SQLException, PelangganException {

        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);

        dao.insertPelanggan(pelanggan);
        fireOnInsert(pelanggan);

    }

    public void updatePelanggan() throws SQLException, PelangganException {

        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        pelanggan.setId(id);

        dao.updatePelanggan(pelanggan);
        fireOnUpdate(pelanggan);

    }

    public void deletePelanggan() throws SQLException, PelangganException {

        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();

        dao.deletePelanggan(id);
        fireOnDelete();

    }
    
    public void resetPelangan(){
        setId(id);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
    }

}
