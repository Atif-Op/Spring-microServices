package methodreference;

public interface DoWork {
    void doWork();
}

class Work {
    public static void main(String[] args) {
        DoStuff d = new DoStuff();
        DoWork o = d::getnumber;
        o.doWork();
    }
}

