package Seminar_4.ClientApplication;


import Seminar_4.Core.UserProvider;
import Seminar_4.Models.User;

/**
 * Класс аутентификации пользователя
 */
public class Authentication {
    /**
     * Метод производит аутентификацию
     *
     * @param userProvider
     * @param login
     * @param passHash
     * @return
     */
    public static User authentication(UserProvider userProvider, String login, int passHash) {
        var client = userProvider.getClientByName(login);
        if (client.getHashPassword() == passHash) {
            return client;
        } else {
            throw new RuntimeException("Authentication fail");
        }
    }
}
