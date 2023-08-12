package seminar_12;

import seminar_12.User;

public class AccessManager {
    private User user;
    private Token token;

    public AccessManager(User user, Token token) {
        this.token=token;
        this.user=user;
    }
    public Token getAutorizationToken(User user){
        token.setLine("1234567890");
        return this.token;
    }
    public boolean checkToken(Token token){
        return token.getLine().equals("1234567890");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
