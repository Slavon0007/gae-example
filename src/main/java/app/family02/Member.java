package app.family02;

public class Member extends Human {
    protected String typeOfMember;

    public Member(String typeOfMember){
        this.typeOfMember = typeOfMember;
    }

    public String toString(){
        return typeOfMember + ":" + super.toString()+";";
    }
}
