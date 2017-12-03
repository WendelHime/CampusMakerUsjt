package workshop.arqdesis.usjt.br.campusmakerusjt;
/**
 * @author wotan this class represents a event
 */
public class Evento{
    private Integer id, tamanhoTurma, periodoInscricao;
    private String nome, descricao, data, horario, duracao, categoria, unidade, administrador, mentor, tipo;
    private Boolean status;

    public Evento() {

    }

    public Evento(Integer id, Integer tamanhoTurma, Integer periodoInscricao, String nome, String descricao, String data, String horario, String duracao, String categoria, String unidade, String administrador, String mentor, String tipo, Boolean status) {
        this.id = id;
        this.tamanhoTurma =tamanhoTurma;
        this.periodoInscricao = periodoInscricao;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.horario = horario;
        this.duracao = duracao;
        this.categoria = categoria;
        this.unidade = unidade;
        this.administrador = administrador;
        this.mentor = mentor;
        this.tipo = tipo;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTamanhoTurma() {
        return tamanhoTurma;
    }

    public void setTamanhoTurma(Integer tamanhoTurma) {
        this.tamanhoTurma = tamanhoTurma;
    }

    public Integer getPeriodoInscricao() {
        return periodoInscricao;
    }

    public void setPeriodoInscricao(Integer periodoInscricao) {
        this.periodoInscricao = periodoInscricao;
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
