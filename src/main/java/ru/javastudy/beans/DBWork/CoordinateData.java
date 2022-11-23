package ru.javastudy.beans.DBWork;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "Coordinate")
public class CoordinateData {

    @Column(name = "x")
    @NotNull
    private Double x;

    @Column(name = "y")
    @NotNull
    private Double y;

    @Column(name = "z")
    @NotNull
    private Double z;

    @Column(name = "hit")
    @NotNull
    private Double hit;


}
