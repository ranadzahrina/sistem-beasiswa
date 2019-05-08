/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "data_mahasiswa", catalog = "tubes_PBO", schema = "")
@NamedQueries({
    @NamedQuery(name = "DataMahasiswa.findAll", query = "SELECT d FROM DataMahasiswa d")
    , @NamedQuery(name = "DataMahasiswa.findByNama", query = "SELECT d FROM DataMahasiswa d WHERE d.nama = :nama")
    , @NamedQuery(name = "DataMahasiswa.findByNim", query = "SELECT d FROM DataMahasiswa d WHERE d.nim = :nim")
    , @NamedQuery(name = "DataMahasiswa.findByProdi", query = "SELECT d FROM DataMahasiswa d WHERE d.prodi = :prodi")
    , @NamedQuery(name = "DataMahasiswa.findByJenisKelamin", query = "SELECT d FROM DataMahasiswa d WHERE d.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "DataMahasiswa.findByKodePos", query = "SELECT d FROM DataMahasiswa d WHERE d.kodePos = :kodePos")
    , @NamedQuery(name = "DataMahasiswa.findByTelepon", query = "SELECT d FROM DataMahasiswa d WHERE d.telepon = :telepon")
    , @NamedQuery(name = "DataMahasiswa.findByTempatTinggal", query = "SELECT d FROM DataMahasiswa d WHERE d.tempatTinggal = :tempatTinggal")
    , @NamedQuery(name = "DataMahasiswa.findByAgama", query = "SELECT d FROM DataMahasiswa d WHERE d.agama = :agama")
    , @NamedQuery(name = "DataMahasiswa.findByStatus", query = "SELECT d FROM DataMahasiswa d WHERE d.status = :status")
    , @NamedQuery(name = "DataMahasiswa.findBySemester", query = "SELECT d FROM DataMahasiswa d WHERE d.semester = :semester")
    , @NamedQuery(name = "DataMahasiswa.findByIpk", query = "SELECT d FROM DataMahasiswa d WHERE d.ipk = :ipk")
    , @NamedQuery(name = "DataMahasiswa.findByNamaAyah", query = "SELECT d FROM DataMahasiswa d WHERE d.namaAyah = :namaAyah")
    , @NamedQuery(name = "DataMahasiswa.findByKerjaAyah", query = "SELECT d FROM DataMahasiswa d WHERE d.kerjaAyah = :kerjaAyah")
    , @NamedQuery(name = "DataMahasiswa.findByGajiAyah", query = "SELECT d FROM DataMahasiswa d WHERE d.gajiAyah = :gajiAyah")
    , @NamedQuery(name = "DataMahasiswa.findByNamaIbu", query = "SELECT d FROM DataMahasiswa d WHERE d.namaIbu = :namaIbu")
    , @NamedQuery(name = "DataMahasiswa.findByKerjaIbu", query = "SELECT d FROM DataMahasiswa d WHERE d.kerjaIbu = :kerjaIbu")
    , @NamedQuery(name = "DataMahasiswa.findByGajiIbu", query = "SELECT d FROM DataMahasiswa d WHERE d.gajiIbu = :gajiIbu")
    , @NamedQuery(name = "DataMahasiswa.findByKodeposOrtu", query = "SELECT d FROM DataMahasiswa d WHERE d.kodeposOrtu = :kodeposOrtu")
    , @NamedQuery(name = "DataMahasiswa.findByTelponOrtu", query = "SELECT d FROM DataMahasiswa d WHERE d.telponOrtu = :telponOrtu")
    , @NamedQuery(name = "DataMahasiswa.findByJumlahAnak", query = "SELECT d FROM DataMahasiswa d WHERE d.jumlahAnak = :jumlahAnak")})
public class DataMahasiswa implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private Integer nim;
    @Basic(optional = false)
    @Column(name = "prodi")
    private String prodi;
    @Basic(optional = false)
    @Lob
    @Column(name = "ttl")
    private String ttl;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "kode_pos")
    private int kodePos;
    @Basic(optional = false)
    @Column(name = "telepon")
    private int telepon;
    @Basic(optional = false)
    @Column(name = "tempat_tinggal")
    private String tempatTinggal;
    @Basic(optional = false)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "semester")
    private int semester;
    @Basic(optional = false)
    @Column(name = "ipk")
    private float ipk;
    @Basic(optional = false)
    @Column(name = "nama_ayah")
    private String namaAyah;
    @Basic(optional = false)
    @Column(name = "kerja_ayah")
    private String kerjaAyah;
    @Basic(optional = false)
    @Column(name = "gaji_ayah")
    private int gajiAyah;
    @Basic(optional = false)
    @Column(name = "nama_ibu")
    private String namaIbu;
    @Basic(optional = false)
    @Column(name = "kerja_ibu")
    private String kerjaIbu;
    @Basic(optional = false)
    @Column(name = "gaji_ibu")
    private int gajiIbu;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat_ortu")
    private String alamatOrtu;
    @Basic(optional = false)
    @Column(name = "kodepos_ortu")
    private int kodeposOrtu;
    @Basic(optional = false)
    @Column(name = "telpon_ortu")
    private int telponOrtu;
    @Basic(optional = false)
    @Column(name = "jumlah_anak")
    private int jumlahAnak;

    public DataMahasiswa() {
    }

    public DataMahasiswa(Integer nim) {
        this.nim = nim;
    }

    public DataMahasiswa(Integer nim, String nama, String prodi, String ttl, String jenisKelamin, String alamat, int kodePos, int telepon, String tempatTinggal, String agama, String status, int semester, float ipk, String namaAyah, String kerjaAyah, int gajiAyah, String namaIbu, String kerjaIbu, int gajiIbu, String alamatOrtu, int kodeposOrtu, int telponOrtu, int jumlahAnak) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ttl = ttl;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.kodePos = kodePos;
        this.telepon = telepon;
        this.tempatTinggal = tempatTinggal;
        this.agama = agama;
        this.status = status;
        this.semester = semester;
        this.ipk = ipk;
        this.namaAyah = namaAyah;
        this.kerjaAyah = kerjaAyah;
        this.gajiAyah = gajiAyah;
        this.namaIbu = namaIbu;
        this.kerjaIbu = kerjaIbu;
        this.gajiIbu = gajiIbu;
        this.alamatOrtu = alamatOrtu;
        this.kodeposOrtu = kodeposOrtu;
        this.telponOrtu = telponOrtu;
        this.jumlahAnak = jumlahAnak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        Integer oldNim = this.nim;
        this.nim = nim;
        changeSupport.firePropertyChange("nim", oldNim, nim);
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        String oldProdi = this.prodi;
        this.prodi = prodi;
        changeSupport.firePropertyChange("prodi", oldProdi, prodi);
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        String oldTtl = this.ttl;
        this.ttl = ttl;
        changeSupport.firePropertyChange("ttl", oldTtl, ttl);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public int getKodePos() {
        return kodePos;
    }

    public void setKodePos(int kodePos) {
        int oldKodePos = this.kodePos;
        this.kodePos = kodePos;
        changeSupport.firePropertyChange("kodePos", oldKodePos, kodePos);
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        int oldTelepon = this.telepon;
        this.telepon = telepon;
        changeSupport.firePropertyChange("telepon", oldTelepon, telepon);
    }

    public String getTempatTinggal() {
        return tempatTinggal;
    }

    public void setTempatTinggal(String tempatTinggal) {
        String oldTempatTinggal = this.tempatTinggal;
        this.tempatTinggal = tempatTinggal;
        changeSupport.firePropertyChange("tempatTinggal", oldTempatTinggal, tempatTinggal);
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        String oldAgama = this.agama;
        this.agama = agama;
        changeSupport.firePropertyChange("agama", oldAgama, agama);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        int oldSemester = this.semester;
        this.semester = semester;
        changeSupport.firePropertyChange("semester", oldSemester, semester);
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        float oldIpk = this.ipk;
        this.ipk = ipk;
        changeSupport.firePropertyChange("ipk", oldIpk, ipk);
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        String oldNamaAyah = this.namaAyah;
        this.namaAyah = namaAyah;
        changeSupport.firePropertyChange("namaAyah", oldNamaAyah, namaAyah);
    }

    public String getKerjaAyah() {
        return kerjaAyah;
    }

    public void setKerjaAyah(String kerjaAyah) {
        String oldKerjaAyah = this.kerjaAyah;
        this.kerjaAyah = kerjaAyah;
        changeSupport.firePropertyChange("kerjaAyah", oldKerjaAyah, kerjaAyah);
    }

    public int getGajiAyah() {
        return gajiAyah;
    }

    public void setGajiAyah(int gajiAyah) {
        int oldGajiAyah = this.gajiAyah;
        this.gajiAyah = gajiAyah;
        changeSupport.firePropertyChange("gajiAyah", oldGajiAyah, gajiAyah);
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        String oldNamaIbu = this.namaIbu;
        this.namaIbu = namaIbu;
        changeSupport.firePropertyChange("namaIbu", oldNamaIbu, namaIbu);
    }

    public String getKerjaIbu() {
        return kerjaIbu;
    }

    public void setKerjaIbu(String kerjaIbu) {
        String oldKerjaIbu = this.kerjaIbu;
        this.kerjaIbu = kerjaIbu;
        changeSupport.firePropertyChange("kerjaIbu", oldKerjaIbu, kerjaIbu);
    }

    public int getGajiIbu() {
        return gajiIbu;
    }

    public void setGajiIbu(int gajiIbu) {
        int oldGajiIbu = this.gajiIbu;
        this.gajiIbu = gajiIbu;
        changeSupport.firePropertyChange("gajiIbu", oldGajiIbu, gajiIbu);
    }

    public String getAlamatOrtu() {
        return alamatOrtu;
    }

    public void setAlamatOrtu(String alamatOrtu) {
        String oldAlamatOrtu = this.alamatOrtu;
        this.alamatOrtu = alamatOrtu;
        changeSupport.firePropertyChange("alamatOrtu", oldAlamatOrtu, alamatOrtu);
    }

    public int getKodeposOrtu() {
        return kodeposOrtu;
    }

    public void setKodeposOrtu(int kodeposOrtu) {
        int oldKodeposOrtu = this.kodeposOrtu;
        this.kodeposOrtu = kodeposOrtu;
        changeSupport.firePropertyChange("kodeposOrtu", oldKodeposOrtu, kodeposOrtu);
    }

    public int getTelponOrtu() {
        return telponOrtu;
    }

    public void setTelponOrtu(int telponOrtu) {
        int oldTelponOrtu = this.telponOrtu;
        this.telponOrtu = telponOrtu;
        changeSupport.firePropertyChange("telponOrtu", oldTelponOrtu, telponOrtu);
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        int oldJumlahAnak = this.jumlahAnak;
        this.jumlahAnak = jumlahAnak;
        changeSupport.firePropertyChange("jumlahAnak", oldJumlahAnak, jumlahAnak);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataMahasiswa)) {
            return false;
        }
        DataMahasiswa other = (DataMahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pendaftaran.DataMahasiswa[ nim=" + nim + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
