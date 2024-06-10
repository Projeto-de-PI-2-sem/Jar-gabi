package org.notelog.model;

public class RedeWifi {
    private Integer id;
    private String nome;
    private String nomeExibicao;
    private String enderecoIpv4;
    private String enderecoIpv6;
    private String enderecoMac;
    private Long bytesRecebidos;
    private Long bytesEnviados;
    private Long pacotesRecebidos;
    private Long pacotesEnviados;
    private Integer fkNotebook;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public String getEnderecoIpv4() {
        return enderecoIpv4;
    }

    public void setEnderecoIpv4(String enderecoIpv4) {
        this.enderecoIpv4 = enderecoIpv4;
    }

    public String getEnderecoIpv6() {
        return enderecoIpv6;
    }

    public void setEnderecoIpv6(String enderecoIpv6) {
        this.enderecoIpv6 = enderecoIpv6;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public void setEnderecoMac(String enderecoMac) {
        this.enderecoMac = enderecoMac;
    }

    public Long getBytesRecebidos() {
        return bytesRecebidos;
    }

    public void setBytesRecebidos(Long bytesRecebidos) {
        this.bytesRecebidos = bytesRecebidos;
    }

    public Long getBytesEnviados() {
        return bytesEnviados;
    }

    public void setBytesEnviados(Long bytesEnviados) {
        this.bytesEnviados = bytesEnviados;
    }

    public Long getPacotesRecebidos() {
        return pacotesRecebidos;
    }

    public void setPacotesRecebidos(Long pacotesRecebidos) {
        this.pacotesRecebidos = pacotesRecebidos;
    }

    public Long getPacotesEnviados() {
        return pacotesEnviados;
    }

    public void setPacotesEnviados(Long pacotesEnviados) {
        this.pacotesEnviados = pacotesEnviados;
    }

    public Integer getFkNotebook() {
        return fkNotebook;
    }

    public void setFkNotebook(Integer fkNotebook) {
        this.fkNotebook = fkNotebook;
    }
}

