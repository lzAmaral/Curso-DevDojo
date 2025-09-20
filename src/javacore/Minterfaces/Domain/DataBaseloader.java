package javacore.Minterfaces.Domain;

public class DataBaseloader implements DataLoader{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }


    @Override
    public void checkPermission() {
 System.out.println("checando permissão no banco de dados...");  
  }

}
