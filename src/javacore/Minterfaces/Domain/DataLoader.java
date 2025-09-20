package javacore.Minterfaces.Domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();
     default public  void checkPermission(){
        System.out.println("Checando permissões");
     }
     public static void retrieveMaxDataSize(){
        System.out.println("O tamanho máximo é: " + MAX_DATA_SIZE);
     }

}
