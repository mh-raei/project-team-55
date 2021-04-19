package controller.menucontroller;

import exceptions.MenuException;
import model.User;
import view.Menus.Menu;
import view.Menus.MenuType;

public class ProfileMenuController extends MenuController {
    private static ProfileMenuController profileMenuController;

    private ProfileMenuController() {
    }

    public static ProfileMenuController getInstance() {
        if (profileMenuController == null) profileMenuController = new ProfileMenuController();
        return profileMenuController;
    }

    public void changeNickname(String nickname) throws MenuException {
        if (User.nicknameExists(nickname)) {
            throw new MenuException("user with nickname " + nickname + " already exists");
        } else {
            User.loggedInUser.setNickname(nickname);
        }
    }

    public void changePassword(String currentPassword, String newPassword) throws MenuException {
        if (!User.loggedInUser.getPassword().equals(currentPassword)) {
            throw new MenuException("current password is invalid");
        } else if (newPassword.equals(currentPassword)) {
            throw new MenuException("please enter a new password");
        }
        User.loggedInUser.setPassword(newPassword);
    }

    @Override
    public void enterMenu(String menu) throws MenuException {
        throw new MenuException("menu navigation is not possible");
    }

    @Override
    public void exitMenu() {
        Menu.setCurrentMenu(MenuType.MAIN);
    }

}