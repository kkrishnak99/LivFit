package plkk.developers.com.livfit;

/**
 * Created by Krishna on 6/18/2017.
 */

public class Users {

    private String fullname,username,password,verify_password;
    private float height, weight;
    private int gender,_id;

    public Users(String fullname, String username, String password, float height, float weight, int gender) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
