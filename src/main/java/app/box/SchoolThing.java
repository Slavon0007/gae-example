package app.box;

public abstract class SchoolThing {
    protected String producedBy;

    public SchoolThing(String producedBy) {
        if (producedBy == null) {
            this.producedBy = "Not define";
        } else {
            this.producedBy = producedBy;
        }
    }

    @Override
    public String toString() {
        return "producedBy: " + producedBy;
    }
}
