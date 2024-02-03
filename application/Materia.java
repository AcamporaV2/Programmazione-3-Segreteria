package application;

class MateriaNuova implements Contenuto {
    private String nome;
    private StrategiaValutazione strategia;

    public MateriaNuova(String nome, StrategiaValutazione strategia) {
        this.nome = nome;
        this.strategia = strategia;
    }

    @Override
    public void stampaDescrizione() {
        System.out.println("Materia: " + nome);
    }

    public int eseguiTest(int risposteCorrette) {
        return strategia.valutaTest(risposteCorrette);
    }
}
