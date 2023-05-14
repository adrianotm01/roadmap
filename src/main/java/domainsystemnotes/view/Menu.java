package domainsystemnotes.view;

public interface Menu {


    default void showOption(){
        System.out.println("1 - Visualizar");
        System.out.println("2 - Adicionar");
        System.out.println("3 - Remover");
        System.out.println("4 - Atualizar");
    }
    default void chooseOption(){
        System.out.println("ESCOLHA A OPÇÃO");
        System.out.println("1 - Notes");
        System.out.println("2 - EletronicNotes");
    }

    void visualize(String entity);

    void add(String entity);

    void remove(String entity);

    void update(String entity);

     void setStrategy(MenuStrategy strategy);

}
