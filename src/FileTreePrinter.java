package src;

import java.io.File;

//lab1
public class FileTreePrinter {

    public static void main(String[] args) {
        File currentDir = new File(".");
        printFileTree(currentDir, 0);
    }

    private static void printFileTree(File file, int depth) {
        System.out.println("\t".repeat(Math.max(0, depth)) + file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    printFileTree(child, depth + 1);
                }
            }
        }
    }
}

