package composite;

public interface FileItem {

    void ls (int level);

    String getName();

    double getSize();

    void open();
}
