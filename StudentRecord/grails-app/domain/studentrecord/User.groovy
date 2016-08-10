package studentrecord

class User {
    String email_id;
    String password_hash;

    static constraints = {
        email_id email: true,blank: false
        password_hash blank: false
    }
}
