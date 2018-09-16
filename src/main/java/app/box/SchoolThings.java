package app.box;

public abstract class SchoolThings {
    protected String producedBy;

    public SchoolThings(String producedBy){

         this.producedBy = producedBy;
    }

    @Override
    public String toString() {
        return
                "producedBy='" + producedBy
                ;
    }
}
