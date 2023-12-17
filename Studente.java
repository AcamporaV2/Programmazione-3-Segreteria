import java.util.List;

public class Studente {

    // Variabili istanza studente
    private String nomeS = "";
    private String cognomeS = "";
    private String matricolaS = "";
    private String dataNascitaS = "";
    private String residenzaS = "";
    private String pianoDiStudi = "";
    private List<Float> votoEsami;
    private boolean tassePagate = false;

    // Costruttore vuoto
    public Studente() {}

    // Costruttore con parametri
    public Studente(String nomeS, String cognomeS, String matricolaS, String dataNascitaS, String residenzaS, String pianoDiStudi, List<Float> votoEsami, boolean tassePagate) {
        this.nomeS = nomeS;
        this.cognomeS = cognomeS;
        this.matricolaS = matricolaS;
        this.dataNascitaS = dataNascitaS;
        this.residenzaS = residenzaS;
        this.pianoDiStudi = pianoDiStudi;
        this.votoEsami = votoEsami;
        this.tassePagate = tassePagate;
    }

    // Getter e setter per nomeS
    public String getNomeS() {
        return nomeS;
    }

    public void setNomeS(String nomeS) {
        this.nomeS = nomeS;
    }

    // Getter e setter per cognomeS
    public String getCognomeS() {
        return cognomeS;
    }

    public void setCognomeS(String cognomeS) {
        this.cognomeS = cognomeS;
    }

    // Getter e setter per matricolaS
    public String getMatricolaS() {
        return matricolaS;
    }

    public void setMatricolaS(String matricolaS) {
        this.matricolaS = matricolaS;
    }

    // Getter e setter per dataNascitaS
    public String getDataNascitaS() {
        return dataNascitaS;
    }

    public void setDataNascitaS(String dataNascitaS) {
        this.dataNascitaS = dataNascitaS;
    }

    // Getter e setter per residenzaS
    public String getResidenzaS() {
        return residenzaS;
    }

    public void setResidenzaS(String residenzaS) {
        this.residenzaS = residenzaS;
    }

    // Getter e setter per pianoDiStudi
    public String getPianoDiStudi() {
        return pianoDiStudi;
    }

    public void setPianoDiStudi(String pianoDiStudi) {
        this.pianoDiStudi = pianoDiStudi;
    }

    // Getter e setter per votoEsami
    public List<Float> getVotoEsami() {
        return votoEsami;
    }

    public void setVotoEsami(List<Float> votoEsami) {
        this.votoEsami = votoEsami;
    }

    // Getter e setter per tassePagate
    public boolean getTassePagate() {
        return tassePagate;
    }

    public void setTassePagate(boolean tassePagate) {
        this.tassePagate = tassePagate;
    }
}
