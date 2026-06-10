/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2410010473_sisteminformasiakademik;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2410010473
 */
public class Guru {
    /**
     NIK        : Nomor Induk Karyawan
     Nama       : Nama Guru
     Tmpt Lhr   : Tempat Lahir Guru
     Tgl Lhr    : Tanggal Lahir Guru
     Agama      : Agama Guru
     JK         : Jenis Kelamin Guru
     Tlp        : Telepon Guru
     Email      : Email Guru
     Alamat     : Alamat Guru
     Pendidikan : Pendidikan Guru
     Jabatan    : Jabatan Guru
     Status     : Status Kawin
     Blokir     : Y / N
     */
    private String nik, namaGuru, tmptLhrGuru, tglLhrGuru, passGuru;
    private String agmGuru, jkGuru, tlpGuru, emailGuru, almtGuru;
    private String pendGuru, statusKawin, jabatan, blokirGuru;

    private ArrayList<String> dataNik;
    private ArrayList<String> dataNama;
    private ArrayList<String> dataJabatan;

    public Guru() {
        this.dataNik = new ArrayList<>();
        this.dataNama = new ArrayList<>();
        this.dataJabatan = new ArrayList<>();
    }

    public Guru(String nik, String namaGuru, String tmptLhrGuru, String tglLhrGuru,
                String agmGuru, String jkGuru, String tlpGuru, String emailGuru,
                String almtGuru, String pendGuru, String statusKawin,
                String jabatan, String blokirGuru) {
        this.nik = nik;
        this.namaGuru = namaGuru;
        this.tmptLhrGuru = tmptLhrGuru;
        this.tglLhrGuru = tglLhrGuru;
        this.agmGuru = agmGuru;
        this.jkGuru = jkGuru;
        this.tlpGuru = tlpGuru;
        this.emailGuru = emailGuru;
        this.almtGuru = almtGuru;
        this.pendGuru = pendGuru;
        this.statusKawin = statusKawin;
        this.jabatan = jabatan;
        this.blokirGuru = blokirGuru;
        this.dataNik = new ArrayList<>();
        this.dataNama = new ArrayList<>();
        this.dataJabatan = new ArrayList<>();
    }

    public int getIndexData(String nik) {
        int index = -1;
        index = this.dataNik.indexOf(nik);
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        } else {
            System.out.print(index);
        }
        return index;
    }

    public void cariDataGuru(String nik) {
        int index = getIndexData(nik);
        if (index >= 0) {
            String nama = this.dataNama.get(index);
            String jab = this.dataJabatan.get(index);
            String pesan = "NIK: " + nik + "\nNama Guru: " + nama + "\nJabatan: " + jab;
            JOptionPane.showMessageDialog(null, pesan);
        } else {
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
    }

    public void inputDataNik(String nik) { this.dataNik.add(nik); }
    public void inputDataNama(String nama) { this.dataNama.add(nama); }
    public void inputDataJabatan(String jab) { this.dataJabatan.add(jab); }

    public ArrayList<String> listDataNik() { return this.dataNik; }
    public ArrayList<String> listDataNama() { return this.dataNama; }
    public ArrayList<String> listDataJabatan() { return this.dataJabatan; }

    public void setNik(String nik) { this.nik = nik; }
    public void setNamaGuru(String namaGuru) { this.namaGuru = namaGuru; }
    public void setTmptLhrGuru(String tmptLhrGuru) { this.tmptLhrGuru = tmptLhrGuru; }
    public void setTglLhrGuru(String tglLhrGuru) { this.tglLhrGuru = tglLhrGuru; }
    public void setAgmGuru(String agmGuru) { this.agmGuru = agmGuru; }
    public void setJkGuru(String jkGuru) { this.jkGuru = jkGuru; }
    public void setTlpGuru(String tlpGuru) { this.tlpGuru = tlpGuru; }
    public void setEmailGuru(String emailGuru) { this.emailGuru = emailGuru; }
    public void setAlmtGuru(String almtGuru) { this.almtGuru = almtGuru; }
    public void setPendGuru(String pendGuru) { this.pendGuru = pendGuru; }
    public void setStatusKawin(String statusKawin) { this.statusKawin = statusKawin; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
    public void setBlokirGuru(String blokirGuru) { this.blokirGuru = blokirGuru; }

    public String getNik() { return this.nik; }
    public String getNamaGuru() { return this.namaGuru; }
    public String getTmptLhrGuru() { return this.tmptLhrGuru; }
    public String getTglLhrGuru() { return this.tglLhrGuru; }
    public String getAgmGuru() { return this.agmGuru; }
    public String getJkGuru() { return this.jkGuru; }
    public String getTlpGuru() { return this.tlpGuru; }
    public String getEmailGuru() { return this.emailGuru; }
    public String getAlmtGuru() { return this.almtGuru; }
    public String getPendGuru() { return this.pendGuru; }
    public String getStatusKawin() { return this.statusKawin; }
    public String getJabatan() { return this.jabatan; }
    public String getBlokirGuru() { return this.blokirGuru; }
}
