package com.biblioteca_anime.biblioteca_anime.models;


public class Anime {
    private Integer id;
    private String nomeDoAnime;
    private String dataDeLançamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoAnime() {
        return nomeDoAnime;
    }

    public void setNomeDoAnime(String nomeDoAnime) {
        this.nomeDoAnime = nomeDoAnime;
    }

    public String getDataDeLançamento() {
        return dataDeLançamento;
    }

    public void setDataDeLançamento(String dataDeLançamento) {
        this.dataDeLançamento = dataDeLançamento;
    }


}
