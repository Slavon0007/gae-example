package app.box;

public abstract class SchoolThings {
    protected String producedBy;

    public SchoolThings(String producedBy){

        if (producedBy == null) {
            this.producedBy = "Not define";
        } else {
            this.producedBy = producedBy;
        }

    }


    @Override
    public String toString() { return "producedBy" + producedBy; }
}
