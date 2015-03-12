package com.magicmonster.example.orika.nested;

public class PlantDTO {
    private String location;
    private long scoville;
    private String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getScoville() {
        return scoville;
    }

    public void setScoville(long scoville) {
        this.scoville = scoville;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlantDTO{" +
                "location='" + location + '\'' +
                ", scoville=" + scoville +
                ", name='" + name + '\'' +
                '}';
    }
}
