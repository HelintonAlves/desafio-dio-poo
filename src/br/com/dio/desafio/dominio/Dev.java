package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoSetInscrito = new LinkedHashSet();
    private Set<Conteudo> conteudoSetConcluido = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudoSetInscrito.addAll(bootCamp.getConteudoSet());
        bootCamp.getDevSet().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoSetInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoSetConcluido.add(conteudo.get());
            this.conteudoSetInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não está inscrito em nenhum conteúdo");
        }
    }

    public double caluclarTotalXp(){
        return this.conteudoSetConcluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoSetInscrito() {
        return conteudoSetInscrito;
    }

    public void setConteudoSetInscrito(Set<Conteudo> conteudoSetInscrito) {
        this.conteudoSetInscrito = conteudoSetInscrito;
    }

    public Set<Conteudo> getConteudoSetConcluido() {
        return conteudoSetConcluido;
    }

    public void setConteudoSetConcluido(Set<Conteudo> conteudoSetConcluido) {
        this.conteudoSetConcluido = conteudoSetConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudoSetInscrito(), dev.getConteudoSetInscrito()) && Objects.equals(getConteudoSetConcluido(), dev.getConteudoSetConcluido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudoSetInscrito(), getConteudoSetConcluido());
    }
}
