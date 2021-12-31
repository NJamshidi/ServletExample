package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao extends BaseDao {

    public void create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }


}
