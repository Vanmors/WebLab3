package ru.javastudy.beans.DBWork;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import ru.javastudy.beans.ResultTable;

//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@Table(name = "Coordinates")
//public class CoordinateData {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @Column(name = "x", nullable = false)
//    private Double x;
//    @Column(name = "y", nullable = false)
//    private Double y;
//    @Column(name = "r", nullable = false)
//    private Double r;
//    @Column(name = "hit", nullable = false)
//    private Boolean hit;
//
//    public CoordinateData(ResultTable sourceResult) {
//        this.id = sourceResult.id;
//        this.x = sourceResult.getX();
//        this.y = sourceResult.getY();
//        this.r = sourceResult.getR();
//        this.hit = checkHit();
//    }
//
//
//    private boolean checkHit() {
//        return ((x>=0 && y<=0 && x*x+y*y<r*r/4) || (x>=0 && y>=0 && x<=r-2*y) || (x<=0 && y>=0 && x>=-r/2 && y<=r));
//    }
//
//
//}
