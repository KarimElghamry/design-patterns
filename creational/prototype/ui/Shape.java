package creational.prototype.ui;

public interface Shape {
    public Float area();

    public void setColor(String color);

    /**
     * Responsible for copying this object at runtime
     * 
     * @return copy of the current object
     */
    public Shape clone();
}
