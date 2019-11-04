package TipoComponentes;

public enum TiposDeComponentes {
    OFFICE("Office"),
    GAMER("Gamer");

    private final String tipo;

    TiposDeComponentes(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}