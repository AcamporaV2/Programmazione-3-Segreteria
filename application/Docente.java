package application;

public class Docente extends Persona { //sottoclasse Docente
	private String materia;
	
	public Docente() { //costruttore vuoto
		super();
		this.materia = "";
	}
	
	public Docente(String nome, String cognome, String materia) { //costruttore parametrizzato
		super(nome, cognome);
		this.materia = materia;
	
	}
	
	// Override dei metodi setNome e setCognome della superclasse Persona
	@Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setCognome(String cognome) {
        super.setCognome(cognome);
    }
    
    //metodi set e get delle variabili di Docente
    public String getMateria() {
    	return materia;
    }
    
    public void setMateria(String materia) {
    	this.materia = materia;
    }
    
}