/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Albuns.Model;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author igorj
 */
@Entity
@Table(name = "album")
@NamedQueries({@NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a"), @NamedQuery(name = "Album.findByIdAlbum", query = "SELECT a FROM Album a WHERE a.idAlbum = :idAlbum"), @NamedQuery(name = "Album.findByTituloAlbum", query = "SELECT a FROM Album a WHERE a.tituloAlbum = :tituloAlbum"), @NamedQuery(name = "Album.findByNomeArtistaAlbum", query = "SELECT a FROM Album a WHERE a.nomeArtistaAlbum = :nomeArtistaAlbum"), @NamedQuery(name = "Album.findByGeneroAlbum", query = "SELECT a FROM Album a WHERE a.generoAlbum = :generoAlbum"), @NamedQuery(name = "Album.findByAnoLancamentoAlbum", query = "SELECT a FROM Album a WHERE a.anoLancamentoAlbum = :anoLancamentoAlbum")})
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_album")
    private Integer idAlbum;
    @Basic(optional = false)
    @Column(name = "titulo_album")
    private String tituloAlbum;
    @Basic(optional = false)
    @Column(name = "nome_artista_album")
    private String nomeArtistaAlbum;
    @Basic(optional = false)
    @Column(name = "genero_album")
    private String generoAlbum;
    @Basic(optional = false)
    @Column(name = "ano_lancamento_album")
    private Integer anoLancamentoAlbum;
    @JoinColumn(name = "lista_album", referencedColumnName = "id_lista")
    @ManyToOne(optional = false)
    private Lista listaAlbum;

    public Album() {
    }

    public Album(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public Album(Integer idAlbum, String tituloAlbum, String nomeArtistaAlbum, String generoAlbum, Integer anoLancamentoAlbum) {
        this.idAlbum = idAlbum;
        this.tituloAlbum = tituloAlbum;
        this.nomeArtistaAlbum = nomeArtistaAlbum;
        this.generoAlbum = generoAlbum;
        this.anoLancamentoAlbum = anoLancamentoAlbum;
    }

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public String getNomeArtistaAlbum() {
        return nomeArtistaAlbum;
    }

    public void setNomeArtistaAlbum(String nomeArtistaAlbum) {
        this.nomeArtistaAlbum = nomeArtistaAlbum;
    }

    public String getGeneroAlbum() {
        return generoAlbum;
    }

    public void setGeneroAlbum(String generoAlbum) {
        this.generoAlbum = generoAlbum;
    }

    public Integer getAnoLancamentoAlbum() {
        return anoLancamentoAlbum;
    }

    public void setAnoLancamentoAlbum(Integer anoLancamentoAlbum) {
        this.anoLancamentoAlbum = anoLancamentoAlbum;
    }

    public Lista getListaAlbum() {
        return listaAlbum;
    }

    public void setListaAlbum(Lista listaAlbum) {
        this.listaAlbum = listaAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlbum != null ? idAlbum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.idAlbum == null && other.idAlbum != null) || (this.idAlbum != null && !this.idAlbum.equals(other.idAlbum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.API.Albuns.Model.Album[ idAlbum=" + idAlbum + " ]";
    }

}
