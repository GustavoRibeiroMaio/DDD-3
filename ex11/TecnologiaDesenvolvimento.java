package ex11;

public  abstract class TecnologiaDesenvolvimento {
	private int id;
    private String nomeLinguagem;
    private String nomeFramework;
    private String descricaoLinguagem;
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLinguagem() {
        return this.nomeLinguagem;
    }

    public void setNomeLinguagem(String nomeLinguagem) {
        this.nomeLinguagem = nomeLinguagem;
    }

    public String getNomeFramework() {
        return this.nomeFramework;
    }

    public void setNomeFramework(String nomeFramework) {
        this.nomeFramework = nomeFramework;
    }

    public String getDescricaoLinguagem() {
        return this.descricaoLinguagem;
    }

    public void setDescricaoLinguagem(String descricaoLinguagem) {
        this.descricaoLinguagem = descricaoLinguagem;
    }

    public TecnologiasDesenvolvimento(int id, String nomeLinguagem, String nomeFramework, String descricaoLinguagem) {
        this.id = id;
        this.nomeLinguagem = nomeLinguagem;
        this.nomeFramework = nomeFramework;
        this.descricaoLinguagem = descricaoLinguagem;
    }

    public TecnologiasDesenvolvimento() {
    }
}
