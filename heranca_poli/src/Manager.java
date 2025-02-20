public class Manager extends Employee {
    private String login;

    private String password;

    private double commission;

    public String getLogin(){
        return login;
    }

    public void setLogin(final String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }
    
    public void setPassword(final String password){
        this.password = password;
    }
}
