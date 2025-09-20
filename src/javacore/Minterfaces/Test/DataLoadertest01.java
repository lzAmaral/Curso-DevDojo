package javacore.Minterfaces.Test;

import java.io.File;

import javacore.Minterfaces.Domain.DataBaseloader;
import javacore.Minterfaces.Domain.DataLoader;
import javacore.Minterfaces.Domain.FileLoader;

public class DataLoadertest01 {
    public static void main(String[] args) {
        DataBaseloader dataBaseloader = new DataBaseloader();
        FileLoader fileLoader = new FileLoader();
        dataBaseloader.load();
        fileLoader.load();
        dataBaseloader.checkPermission();
        fileLoader.checkPermission();
        fileLoader.remove();
        System.out.println(DataLoader.MAX_DATA_SIZE);
        DataLoader.retrieveMaxDataSize();
    }

}
