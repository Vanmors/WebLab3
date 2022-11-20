package ru.javastudy.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Arrays;

@ManagedBean(name = "addToTable", eager = true)
@SessionScoped
public class AddToTable {
    private static ArrayList<ResultTable> Result = new ArrayList<ResultTable>
            (Arrays.asList(new ResultTable(5, "3", "2", true)));

    public ArrayList<ResultTable> getEmployees() {
        return Result;
    }
}
