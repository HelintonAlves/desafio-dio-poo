package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    private LocalDate dataIncial = LocalDate.now();
    private LocalDate dataFinal = LocalDate.now().plusDays(45);
    private Set<Dev> devSet = new HashSet<>();
    private Set<Conteudo> conteudoSet = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataIncial() {
        return dataIncial;
    }

    public void setDataIncial(LocalDate dataIncial) {
        this.dataIncial = dataIncial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Dev> getDevSet() {
        return devSet;
    }

    public void setDevSet(Set<Dev> devSet) {
        this.devSet = devSet;
    }

    public Set<Conteudo> getConteudoSet() {
        return conteudoSet;
    }

    public void setConteudoSet(Set<Conteudo> conteudoSet) {
        this.conteudoSet = conteudoSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(getNome(), bootCamp.getNome()) && Objects.equals(getDescricao(), bootCamp.getDescricao()) && Objects.equals(getDataIncial(), bootCamp.getDataIncial()) && Objects.equals(getDataFinal(), bootCamp.getDataFinal()) && Objects.equals(getDevSet(), bootCamp.getDevSet()) && Objects.equals(getConteudoSet(), bootCamp.getConteudoSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataIncial(), getDataFinal(), getDevSet(), getConteudoSet());
    }
}
