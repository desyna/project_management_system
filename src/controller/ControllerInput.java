/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.InsertDataView;
import view.LoginView;
import model.Connector;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author G a r a
 */
public class ControllerInput {

    InsertDataView insertDataView;

    public ControllerInput(InsertDataView insertDataView) {
        this.insertDataView = insertDataView;

    }

    public void input() {
        String nama = insertDataView.getInputNama().getText();
        String nim = insertDataView.getInputNIM().getText();
        String AA = insertDataView.getAA();
        String AOK = insertDataView.getAOK();
        String OPK = insertDataView.getOPK();
        String PBO = insertDataView.getPBO();
        String PKN = insertDataView.getPKN();
        String PPBO = insertDataView.getPPBO();
        String PSCPK = insertDataView.getPSCPK();
        String RPL = insertDataView.getRPL();
        String SCPK = insertDataView.getSCPK();
        String TECHNO = insertDataView.getTECHNO();

        double aa = 0.0;
        double aok = 0.0;
        double opk = 0.0;
        double pbo = 0.0;
        double pkn = 0.0;
        double ppbo = 0.0;
        double pscpk = 0.0;
        double rpl = 0.0;
        double scpk = 0.0;
        double techno = 0.0;

        try {
            Connector connector = new Connector();

            switch (AA) {
                case "A": {
                    aa = 4.0;
                    break;
                }
                case "B+": {
                    aa = 3.5;
                    break;
                }
                case "B": {
                    aa = 3.0;
                    break;
                }
                case "C+": {
                    aa = 2.5;
                    break;
                }
                case "C": {
                    aa = 2.0;
                    break;
                }
                case "D": {
                    aa = 1.0;
                    break;
                }
                case "E": {
                    aa = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (AOK) {
                case "A": {
                    aok = 4.0;
                    break;
                }
                case "B+": {
                    aok = 3.5;
                    break;
                }
                case "B": {
                    aok = 3.0;
                    break;
                }
                case "C+": {
                    aok = 2.5;
                    break;
                }
                case "C": {
                    aok = 2.0;
                    break;
                }
                case "D": {
                    aok = 1.0;
                    break;
                }
                case "E": {
                    aok = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (OPK) {
                case "A": {
                    opk = 4.0;
                    break;
                }
                case "B+": {
                    opk = 3.5;
                    break;
                }
                case "B": {
                    opk = 3.0;
                    break;
                }
                case "C+": {
                    opk = 2.5;
                    break;
                }
                case "C": {
                    opk = 2.0;
                    break;
                }
                case "D": {
                    opk = 1.0;
                    break;
                }
                case "E": {
                    opk = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (PBO) {
                case "A": {
                    pbo = 4.0;
                    break;
                }
                case "B+": {
                    pbo = 3.5;
                    break;
                }
                case "B": {
                    pbo = 3.0;
                    break;
                }
                case "C+": {
                    pbo = 2.5;
                    break;
                }
                case "C": {
                    pbo = 2.0;
                    break;
                }
                case "D": {
                    pbo = 1.0;
                    break;
                }
                case "E": {
                    pbo = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (PKN) {
                case "A": {
                    pkn = 4.0;
                    break;
                }
                case "B+": {
                    pkn = 3.5;
                    break;
                }
                case "B": {
                    pkn = 3.0;
                    break;
                }
                case "C+": {
                    pkn = 2.5;
                    break;
                }
                case "C": {
                    pkn = 2.0;
                    break;
                }
                case "D": {
                    pkn = 1.0;
                    break;
                }
                case "E": {
                    pkn = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (PPBO) {
                case "A": {
                    ppbo = 4.0;
                    break;
                }
                case "B+": {
                    ppbo = 3.5;
                    break;
                }
                case "B": {
                    ppbo = 3.0;
                    break;
                }
                case "C+": {
                    ppbo = 2.5;
                    break;
                }
                case "C": {
                    ppbo = 2.0;
                    break;
                }
                case "D": {
                    ppbo = 1.0;
                    break;
                }
                case "E": {
                    ppbo = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (PSCPK) {
                case "A": {
                    pscpk = 4.0;
                    break;
                }
                case "B+": {
                    pscpk = 3.5;
                    break;
                }
                case "B": {
                    pscpk = 3.0;
                    break;
                }
                case "C+": {
                    pscpk = 2.5;
                    break;
                }
                case "C": {
                    pscpk = 2.0;
                    break;
                }
                case "D": {
                    pscpk = 1.0;
                    break;
                }
                case "E": {
                    pscpk = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (RPL) {
                case "A": {
                    rpl = 4.0;
                    break;
                }
                case "B+": {
                    rpl = 3.5;
                    break;
                }
                case "B": {
                    rpl = 3.0;
                    break;
                }
                case "C+": {
                    rpl = 2.5;
                    break;
                }
                case "C": {
                    rpl = 2.0;
                    break;
                }
                case "D": {
                    rpl = 1.0;
                    break;
                }
                case "E": {
                    rpl = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (SCPK) {
                case "A": {
                    scpk = 4.0;
                    break;
                }
                case "B+": {
                    scpk = 3.5;
                    break;
                }
                case "B": {
                    scpk = 3.0;
                    break;
                }
                case "C+": {
                    scpk = 2.5;
                    break;
                }
                case "C": {
                    scpk = 2.0;
                    break;
                }
                case "D": {
                    scpk = 1.0;
                    break;
                }
                case "E": {
                    scpk = 0.0;
                    break;
                }
                default: {
                }
            }

            switch (TECHNO) {
                case "A": {
                    techno = 4.0;
                    break;
                }
                case "B+": {
                    techno = 3.5;
                    break;
                }
                case "B": {
                    techno = 3.0;
                    break;
                }
                case "C+": {
                    techno = 2.5;
                    break;
                }
                case "C": {
                    techno = 2.0;
                    break;
                }
                case "D": {
                    techno = 1.0;
                    break;
                }
                case "E": {
                    techno = 0.0;
                    break;
                }
                default: {
                }
            }

//            if (AA.equals("Pilih Nilai") || AOK.equals("Pilih Nilai") || OPK.equals("Pilih Nilai") || PBO.equals("Pilih Nilai") || PKN.equals("Pilih Nilai") || PPBO.equals("Pilih Nilai") || PSCPK.equals("Pilih Nilai") || RPL.equals("Pilih Nilai") || SCPK.equals("Pilih Nilai") || TECHNO.equals("Pilih Nilai")) {
//                String message = "Input Ada Yang Salah Atau Kosong !";
//                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
//                insertDataView.dispose();
//                new InsertDataView().setVisible(true);
//            }

            // MENGHITUNG IPS
            double IPS = (((aa * 2) + (aok * 3) + (opk * 3) + (pbo * 3) + (pkn * 2) + (ppbo * 1) + (pscpk * 1) + (rpl * 3) + (scpk * 3) + (techno * 3)) / 24);

            // END OF COUNTING
            if (nama.isEmpty() || nim.isEmpty() || AA.equals("Pilih Nilai") || AOK.equals("Pilih Nilai") || OPK.equals("Pilih Nilai") || PBO.equals("Pilih Nilai") || PKN.equals("Pilih Nilai") || PPBO.equals("Pilih Nilai") || PSCPK.equals("Pilih Nilai") || RPL.equals("Pilih Nilai") || SCPK.equals("Pilih Nilai") || TECHNO.equals("Pilih Nilai") ) {
                String message = "Input Ada Yang Salah Atau Kosong !";
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                insertDataView.dispose();
                new InsertDataView().setVisible(true);
            } else {
                String query = "INSERT INTO mhs(nama, nim, aa, aok, opk, pbo, pkn, ppbo, pscpk, rpl, scpk, techno, ips) VALUES "
                        + "('" + nama + "', '" + nim + "', '" + AA + "', '" + AOK + "', '" + OPK + "', '" + PBO + "',"
                        + " '" + PKN + "', '" + PPBO + "', '" + PSCPK + "', '" + RPL + "', '" + SCPK + "', '" + TECHNO + "', '" + IPS + "' )";

                Statement statement = connector.koneksi.createStatement();

                int rowsAffected = statement.executeUpdate(query);
                System.out.println(" baris berhasil ditambahkan");

                statement.close();
                connector.koneksi.close();

                String message = "Input Berhasil !";
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);

                insertDataView.dispose();
                new InsertDataView().setVisible(true);
            }
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());

        }
    }

}
