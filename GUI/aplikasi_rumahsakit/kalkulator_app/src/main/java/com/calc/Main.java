package com.calc;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Membuat objek jendela
        JFrame myWindow = new JFrame();

        // judul App 
        myWindow.setTitle("Aplikasi Klinik");

        // ukuran App
        myWindow.setSize(600, 600);

        // Atur agar aplikasi berhenti ketika jendela ditutup
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek desktop pane
        JDesktopPane desktopPane = new JDesktopPane();

        // Menambahkan desktop pane ke dalam jendela
        myWindow.add(desktopPane);

        // Membuat menu-bar
        JMenuBar menuBar = new JMenuBar();
        myWindow.setJMenuBar(menuBar);

        // Membuat menu
        JMenu menuData = new JMenu("Menu");
        menuBar.add(menuData);

        // Menambahkan submenu untuk tambah data pasien
        JMenuItem menuItemTambahPasien = new JMenuItem("Tambah Data Pasien");
        menuItemTambahPasien.addActionListener(e -> {
            String nama = JOptionPane.showInputDialog(myWindow, "Masukkan Username:");
            String keluhan = JOptionPane.showInputDialog(myWindow, "Masukkan Keluhan:");
            String Poli = JOptionPane.showInputDialog(myWindow, "Masukkan Poli :");
            JOptionPane.showMessageDialog(myWindow, "Data Pasien Berhasil " + nama + "\nKeluhan: " + keluhan + "\nPoli: " + Poli);
            // Kode untuk menampilkan form tambah data pasien di sini
            ubahDataPasienEnabled = true; // Mengaktifkan submenu Ubah Data Pasien setelah data pasien diisi
        });
        menuData.add(menuItemTambahPasien);

        // Menambahkan submenu untuk tambah data poli
        JMenuItem menuItemTambahPoli = new JMenuItem("Tambah Data Poli");
        menuItemTambahPoli.addActionListener(e -> {
            if (btnLogin.isEnabled()) {
                
            }
            JOptionPane.showMessageDialog(myWindow, "Menu Tambah Data Poli dipilih");
            // Kode untuk menampilkan form tambah data poli di sini
        });
        menuData.add(menuItemTambahPoli);

        // tambah data submenu untuk ubah data pasien
        JMenuItem menuItemUbahPasien = new JMenuItem("Ubah Data Pasien");
        menuItemUbahPasien.setEnabled(false); // Mulai dengan mengaktifkan submenu ini
        menuItemUbahPasien.addActionListener(e -> {
            // Kode untuk mengubah data pasien di sini
            if (ubahDataPasienEnabled) {
                JOptionPane.showMessageDialog(myWindow, "Data Pasien ada");
                // Kode untuk menampilkan form ubah data pasien di sini
                String namaUbah = JOptionPane.showInputDialog(myWindow, "Masukkan Username yang akan diubah:");
                String keluhanUbah = JOptionPane.showInputDialog(myWindow, "Masukkan Keluhan yang akan diubah:");
                String PoliUbah = JOptionPane.showInputDialog(myWindow, "Masukkan Poli yang akan diubah:");
                JOptionPane.showMessageDialog(myWindow, "Data Pasien Berhasil diubah\nNama: " + namaUbah + "\nKeluhan: " + keluhanUbah + "\nPoli: " + PoliUbah);
                
            }
        });
        menuData.add(menuItemUbahPasien);

        // Membuat tombol untuk login
        JButton btnLogin = new JButton("Login");
        // Menentukan ukuran dan posisi tombol login
        btnLogin.setSize(200, 50);
        btnLogin.setLocation(200, 100);
        // Menambahkan aksi pada tombol login
        btnLogin.addActionListener(e -> {
            String username = JOptionPane.showInputDialog(myWindow, "Masukkan Username:");
            String password = JOptionPane.showInputDialog(myWindow, "Masukkan Password:");
            if (username != null && password != null && username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(myWindow, "Login berhasil! Selamat datang, " + username + "!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                // Kode untuk menampilkan menu setelah login berhasil di sini
                menuData.setEnabled(true); // Mengaktifkan menu setelah login
            } else {
                JOptionPane.showMessageDialog(myWindow, "Login gagal!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Menambahkan tombol login ke dalam desktop pane
        desktopPane.add(btnLogin);

        // Menampilkan jendela ke layar
        myWindow.setVisible(true);
    }
    
    // Variabel untuk melacak apakah data pasien sudah diisi atau belum
    static boolean ubahDataPasienEnabled = false;
}
