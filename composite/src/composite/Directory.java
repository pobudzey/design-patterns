package composite;

import java.util.ArrayList;

public class Directory implements FileItem {

    private ArrayList<FileItem> children;
    private String directoryName;

    public Directory(String directoryName) {
        this.children = new ArrayList<>();
        this.directoryName = directoryName;
    }

    public void add(FileItem fileItem) {
        children.add(fileItem);
    }

    public void remove(FileItem fileItem) {
        children.remove(fileItem);
    }

    @Override
    public void ls(int level) {

        System.out.println(this.directoryName);

        StringBuilder sb = new StringBuilder(level);
        for (int i = 0; i < level; i++) {
            sb.append("   ");
        }
        String s = sb.toString();

        for (FileItem fileItem: children) {
            System.out.print(s);
            fileItem.ls(++level);
        }

    }

    @Override
    public String getName() {
        return this.directoryName;
    }

    @Override
    public double getSize() {
        double totalSize = 0;
        for(FileItem fileItem: children) {
            totalSize += fileItem.getSize();
        }
        return totalSize;
    }

    @Override
    public void open() {
        System.out.println("Opening directory.");
    }
}
