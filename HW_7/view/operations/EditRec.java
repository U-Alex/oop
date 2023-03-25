package view.operations;

import view.ConsoleUI;

public class EditRec extends Options{
    public EditRec(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "редактировать запись";
    }

    @Override
    public void execute() {
        getConsole().editRec();
    }
}
