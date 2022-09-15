package ex11;

public class BackEnd  extends TecnologiasDesenvolvimento implements Tecnologia{
	private boolean conteinerizacao;

    public boolean isConteinerizacao() {
        return this.conteinerizacao;
    }

    public boolean getConteinerizacao() {
        return this.conteinerizacao;
    }

    public void setConteinerizacao(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd() {
    }

	
	public String decreveLinguagem(String nome) {
		
		return null;
	}

	
	public String descreveFramework(String nome) {
		
		return null;
	}
}
