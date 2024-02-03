package application;

class Strategia10Domande implements StrategiaValutazione {
    @Override
    public int valutaTest(int risposteCorrette) {
        return risposteCorrette * 3;
    }
}