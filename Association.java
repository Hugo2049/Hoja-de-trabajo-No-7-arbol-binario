// Clase para representar una asociación entre una palabra en inglés y su equivalente en español
class Association {
    private final String key;
    private final String value;

    public Association(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
