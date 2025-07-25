package views.PrintlnCorlor;

public enum Colors {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m");

    private String Color;

    Colors(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
}
