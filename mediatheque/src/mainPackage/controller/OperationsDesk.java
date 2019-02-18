package mainPackage.controller;

import mainPackage.model.Manager;
import mainPackage.model.Persistence;
import mainPackage.model.User;
import mainPackage.model.mediaItems.MediaItem;
import mainPackage.view.View;

public class OperationsDesk {

    private Persistence persistence;
    private View view;


    public OperationsDesk() {
        persistence = new Persistence();
        view = new View();
    }

    public void beginOperations() {

        boolean permission = true;

        view.displayContent();
        // TODO:

//        while (permission) {
//            view.displayContent();
//            String userCommand = "default";
//
//            try {
//                String value = getInput();
//
//                userCommand = value;
//
//                if (value.equals("exit")) {
//                    permission = false;
//                }
//            } catch (Exception e) {
//                wrongInputReaction();
//            }
//
//            actUpon(userCommand);
//
//        }
    }

    private void wrongInputReaction() {

    }

    private void actUpon(String userCommand) {

    }

    private String getInput() {

        return "userInput";
    }

    public void addItem(MediaItem item) {
        persistence.addItem(item);
    }

    public void removeItem(String id) {
        persistence.removeItem(id);
    }
}
