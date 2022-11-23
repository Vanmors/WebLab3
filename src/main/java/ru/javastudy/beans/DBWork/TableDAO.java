package ru.javastudy.beans.DBWork;

import ru.javastudy.beans.ResultTable;

import java.util.List;

public interface TableDAO {
    public ResultTable findById(int id);

    public void save(ResultTable resultTable);

    public void delete(ResultTable resultTable);

    public List<ResultTable> findAll();

}
