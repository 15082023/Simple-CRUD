package com.gdr.demolagi.entities;

import jakarta.persistence.*;

@Table(name ="lead_data")
@Entity
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nama;
    private String deskripsi;

    public Lead(long id, String nama, String deskripsi) {
        Id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Lead() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
