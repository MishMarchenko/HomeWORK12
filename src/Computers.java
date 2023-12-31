public class Computers<O, V> {
    private O os;
    private V version;

    public void setOs(O os) {
        this.os = os;
    }

    public void setVersion(V version) {
        this.version = version;
    }

    public O getOs() {
        return os;
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
