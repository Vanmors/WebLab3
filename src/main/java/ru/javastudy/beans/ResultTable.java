package ru.javastudy.beans;

import java.io.Serializable;

public class ResultTable implements Serializable {
    private double x;
    private String y;
    private String z;
    private boolean hit;

    public ResultTable(double x, String y, String z, boolean hit) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hit = hit;
    }

}
