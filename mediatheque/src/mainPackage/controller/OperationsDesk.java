package mainPackage.controller;

import mainPackage.model.Manager;
import mainPackage.model.Persistence;
import mainPackage.model.User;
import mainPackage.view.View;

public class OperationsDesk {

    private Persistence persistence;
    private View view;


    public OperationsDesk() {
        persistence = new Persistence();
        view = new View();

        beginOperations();
    }

    private void beginOperations() {

        boolean permission = true;

        while (permission) {
            view.displayContent();
            String userCommand = "default";

            try {
                String value = getInput();

                userCommand = value;

                if (value.equals("exit")) {
                    permission = false;
                }
            } catch (Exception e) {
                wrongInputReaction();
            }

            actUpon(userCommand);

        }
    }

    private void wrongInputReaction() {

    }

    private void actUpon(String userCommand) {

    }

    private String getInput() {

        return "userInput";
    }
}
