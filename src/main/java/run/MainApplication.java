package run;

import java.util.Scanner;

import domainsystemnotes.repository.impl.NotesRepositoryImpl;
import domainsystemnotes.service.NotesService;
import domainsystemnotes.view.Menu;
import domainsystemnotes.view.MenuImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class MainApplication {

    public static void main(String[] args) {
        Menu menu = new MenuImpl();
        Scanner input = new Scanner(System.in);
        menu.chooseOption();
//        EntityManager manager = Persistence.createEntityManagerFactory("test").createEntityManager();

        int op = input.nextInt();
        while (op != 0) {
            switch (op) {
                case 1:
                    NotesService service = new NotesService(new NotesRepositoryImpl(null));
                    menu.setStrategy(service);
                    switchMenu(menu, input);
                    menu.chooseOption();
                    op = input.nextInt();
                    break;
                case 2:
                    System.out.println("AUQIIDASDSA");
                    switchMenu(menu, input);
                    break;
            }

        }
    }

    public static void switchMenu(Menu menu, Scanner input) {
        menu.showOption();
        int opInsideMenu = input.nextInt();
        switch (opInsideMenu) {
            case 1:
                menu.visualize("Notas");
                break;
            case 2:
                menu.add("Notas");
                break;
            case 3:
                menu.remove("Notas");
                break;
            case 4:
                menu.update("Notas");
                break;
            case 5:
                return;
        }
    }

}
