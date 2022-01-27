public interface Port {
    void adopt(String name);

    void serve(Tourist a);

    void close();
}
