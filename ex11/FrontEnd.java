package ex11;

public class FrontEnd extends TecnologiasDesenvolvimento implements Tecnologia {
	 private boolean compatibilidadeWeb;
	    private boolean compatibilidadeMobile;

	    public boolean isCompatibilidadeWeb() {
	        return this.compatibilidadeWeb;
	    }

	    public boolean getCompatibilidadeWeb() {
	        return this.compatibilidadeWeb;
	    }

	    public void setCompatibilidadeWeb(boolean compatibilidadeWeb) {
	        this.compatibilidadeWeb = compatibilidadeWeb;
	    }

	    public boolean isCompatibilidadeMobile() {
	        return this.compatibilidadeMobile;
	    }

	    public boolean getCompatibilidadeMobile() {
	        return this.compatibilidadeMobile;
	    }

	    public void setCompatibilidadeMobile(boolean compatibilidadeMobile) {
	        this.compatibilidadeMobile = compatibilidadeMobile;
	    }

	    public FrontEnd(boolean compatibilidadeWeb, boolean compatibilidadeMobile) {
	        this.compatibilidadeWeb = compatibilidadeWeb;
	        this.compatibilidadeMobile = compatibilidadeMobile;
	    }

	    public FrontEnd() {
	    }

	   
	    public String decreveLinguagem(String nome) {
	        
	        return null;
	    }

	   
	    public String descreveFramework(String nome) {
	    
	        return null;
	    }
}
