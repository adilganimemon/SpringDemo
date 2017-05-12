package org.koushik.javabrains;

public class Triangle {

    private String type;
    private int height;

    // Constructor
    public Triangle(String type) {
        this.type = type;
    }
    public Triangle(int height) {
        this.height = height;
    }
    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    // Getters
    public String getType() {
        return type;
    }
    public int getHeight() {
        return height;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    public void draw() {
        System.out.println(getType() + " Triangle Drawn of height: " + getHeight());
    }
}
