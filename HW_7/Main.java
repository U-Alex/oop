import model.Model;
import presenter.Presenter;
import view.ConsoleUI;
import view.DesktopUI;
import view.View;


public class Main {
    public static void main(String[] args) {

        Model model = new Model("data.txt");
        View view = new ConsoleUI();
        //View view = new DesktopUI();
        new Presenter(view, model);
        view.start();
    }
}