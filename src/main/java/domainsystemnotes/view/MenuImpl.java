package domainsystemnotes.view;

public class MenuImpl implements Menu{

    private MenuStrategy strategy;

    public MenuImpl() {
    }

    public MenuImpl(MenuStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void visualize(String entity) {
        System.out.println("Visualizar a "+entity);
        strategy.visualizeAll();
    }

    @Override
    public void add(String entity) {
        System.out.println("Adicionar a "+entity);

    }

    @Override
    public void remove(String entity) {
        System.out.println("Remover a "+entity);

    }

    @Override
    public void update(String entity) {
        System.out.println("Atualizar a "+entity);

    }

    @Override
    public void setStrategy(MenuStrategy strategy) {
        this.strategy = strategy;
    }
}
