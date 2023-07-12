public class Computers<String, V> {
    private String os;
    private V version;

    public void setOs(String os) {
        this.os = os;
    }

    public void setVersion(V version) {
        this.version = version;
    }

    public V getVersion() {
        return version;
    }

    @Override
    public java.lang.String toString() {
        return "Computers " +
                "os = " + os +
                ", version = " + version;
    }
}
