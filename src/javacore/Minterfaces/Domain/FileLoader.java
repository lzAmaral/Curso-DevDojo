package javacore.Minterfaces.Domain;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo...");
    }

}
