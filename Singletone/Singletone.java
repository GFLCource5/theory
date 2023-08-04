public class Singletone implements Serializable {
    private static Singletone instanse;

    private Singletone() {
        if (instance != null) {
            throw new IllegalStateException("Using constructor of Singleton is not allowed.");
        }
    }

    public static synchronized getInstanse() {
        if(instanse == null) {
            instanse = new Singletone();
        }
        return instanse;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of Singleton is not allowed.");
    }

    protected Object readResolve() {
        return instance;
    }
}