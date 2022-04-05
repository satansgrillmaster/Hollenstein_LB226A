package ch.zli.lb226A;

public class User {

    private String userName;

    /**
     * Constructor for the user class, generate a new user with a name
     * @param userName
     */
    public User(String userName){
        this.userName = userName;
    }

    /**
     * getter for the users name
     * @return name of the user
     */
    public String getUserName(){
        return userName;
    }

}
