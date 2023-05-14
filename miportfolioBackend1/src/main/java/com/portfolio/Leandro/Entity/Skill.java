package com.portfolio.Leandro.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Transient;

@Entity
public class Skill {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String percent;
    
    
    @Transient
    private byte[] decompressedImageData;
    
    @JsonIgnore
    @Column(columnDefinition = "MEDIUMBLOB")
    @Lob
    private byte[] imageData;

    public Skill() {
    }

    public Skill(String titulo, String percent, byte[] imageData) {
        this.percent = percent;
        this.titulo = titulo;
        this.imageData = imageData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public byte[] getDecompressedImageData() {
        return decompressedImageData;
    }

    public void setDecompressedImageData(byte[] decompressedImageData) {
        this.decompressedImageData = decompressedImageData;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    

    

    
}

