package Lab02.Exercise02;

public enum Status {
    MARRIED("в браке"),
    SINGLE("не в браке");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
