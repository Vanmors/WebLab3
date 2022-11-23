package ru.javastudy.beans.DBWork;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.javastudy.beans.ResultTable;

import java.util.List;

public class TableDAOImpl implements TableDAO{
    @Override
    public ResultTable findById(int id) {
        return ConnectToDB.getSessionFactory().openSession().get(ResultTable.class, id);
    }
    @Override
    public void save(ResultTable resultTable) {
        Session session = ConnectToDB.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(resultTable);
        tx1.commit();
        session.close();
    }
    @Override
    public void delete(ResultTable resultTable) {
        Session session = ConnectToDB.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(resultTable);
        tx1.commit();
        session.close();
    }
    @Override
    public List<ResultTable> findAll() {
        List<ResultTable> results = ConnectToDB.getSessionFactory().openSession().createQuery("From ResultTable ").list();
        return results;

    }
}
