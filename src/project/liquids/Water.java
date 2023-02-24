package project.liquids;

public abstract class Water {
    private String color = "no";
    private String transparency = "transparency";
    private String smell = "no";
    private int temperature = 0;

    public Water(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public Water() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String geColor() {
        return color;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
