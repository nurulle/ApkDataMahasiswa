package lab.phb.datamahasiswa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//sing nng table name "mahasiswa" kue di sesuaikena karo nama tabel nng data besan
@Table(name = "mahasiswa")
@Data
public class DataMahasiswa {

    @Id
    @Column(name = "nim")
    private String nim;//kie tak ganti string ndikit soalen SING NNG DATA BASESAN atik kue
    @Column(name = "nama")
    private String nama;
    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "alamat")
    private String alamat;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


}
