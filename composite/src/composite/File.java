package composite;

public class File implements FileItem {

    private String fileName;
    private double fileSize;

    public File(String fileName, double fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void ls (int level) {
        System.out.println(this.fileName);
    }

    @Override
    public String getName() {
        return this.fileName;
    }

    @Override
    public double getSize() {
        return this.fileSize;
    }

    @Override
    public void open() {
        System.out.println("Opening file.");
    }
}
