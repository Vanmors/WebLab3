package ru.javastudy.beans;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ResultTable implements Serializable {
    public Long id;
    private double x;
    private Double y;
    private Double r;
    private boolean hit;

    public ResultTable(double x, Double y, Double r, boolean hit) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.hit = hit;
    }

}
