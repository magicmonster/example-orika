package com.magicmonster.example.orika.subclass;

public class FruitDTO {
    private String type;
    private String colour;
    private String variety;
    private String size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FruitDTO{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", variety='" + variety + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
