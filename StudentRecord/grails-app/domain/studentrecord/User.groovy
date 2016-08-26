package studentrecord

class User {

    String userName;
    String password;
    String role
    static constraints = {
        userName blank: false
        password blank: false
        role blank: false
    }
}
