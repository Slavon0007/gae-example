package app.user;

public class User {
    public String name ;
    public User(String name ){
        this.name = name;
    }
    public User(){
        name = "Slava";
    }
    public  void printType(){
        System.out.print("User");
    }

    public void printName(){
        System.out.print(name);
    }

    public void setName(int name) {
        this.name = name + "";
    }


}
