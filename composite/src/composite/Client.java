package composite;

public class Client {

    public static void main(String[] args) {

        Directory mainDirectory = new Directory("My Documents");
        Directory subDirectory = new Directory("Winter 2020");
        File textFile1 = new File("soen344notes.txt", 46);
        File textFile2 = new File("soen390notes.txt", 87);

        mainDirectory.add(subDirectory);
        subDirectory.add(textFile1);
        subDirectory.add(textFile2);

        mainDirectory.ls(0);
    }
}
