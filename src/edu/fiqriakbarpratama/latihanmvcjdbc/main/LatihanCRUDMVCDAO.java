/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fiqriakbarpratama.latihanmvcjdbc.main;

import edu.fiqriakbarpratama.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.fiqriakbarpratama.latihanmvcjdbc.entity.Pelanggan;
import edu.fiqriakbarpratama.latihanmvcjdbc.error.PelangganException;
import edu.fiqriakbarpratama.latihanmvcjdbc.service.PelangganDao;
import edu.fiqriakbarpratama.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author KoalaX
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1
 * 
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                }
                catch (PelangganException ex) {
                        Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

}
