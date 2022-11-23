package ru.javastudy.beans;

import lombok.Data;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;

@ManagedBean
@SessionScoped
@Data
public class XBean {

    @Inject
    private double value1;
    private Double Z;
    private Double inputText;
    private boolean hit = false;

//    public String getInputText() {
//        return inputText;
//    }
//
//    public void setInputText(String inputText) {
//        this.inputText = inputText;
//    }
//
//
//    public String getZ() {
//        return Z;
//    }
//
//    public void setZ(String Z) {
//        this.Z = Z;
//    }
//
//    public double getValue1() {
//        return value1;
//    }
//
//    public void setValue1(double value1) {
//        this.value1 = value1;
//    }

//    public boolean getHit(){
//        return hit;
//    }
//    public void setHit() {
//        double y = Double.parseDouble(inputText);
//        double r = Double.parseDouble(Z);
//
//        if (((value1 * value1 + y * y) <= r * r && value1 <= 0 && y >= 0) ||
//                (y + value1 <= r && value1 >= 0 && y <= 0) ||
//                (y / 2 >= (value1 - r / 2) && value1 >= 0 && y >= 0)) {
//            hit = true;
//        } else {
//            hit = false;
//        }
//    }

    ArrayList<ResultTable> Result = new ArrayList<ResultTable>
            (Arrays.asList(new ResultTable(value1, inputText, Z, hit)));

    public ArrayList<ResultTable> getEmployees() {
        return Result;
    }


    public String verifyUser() {
        return "success";
    }
}