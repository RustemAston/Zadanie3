package aston_rest2.repository;

import aston_rest2.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDAO {
    private final SessionFactory sessionFactory;

    public UserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<User> getAllUsers(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public Optional<User> getOneUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        return Optional.ofNullable(session.get(User.class, id));
    }

    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void updateUser(int id, User user) {
        Session session = sessionFactory.getCurrentSession();

        User ourUser = session.get(User.class, id);
        ourUser.setNickname(user.getNickname());
        ourUser.setAge(user.getAge());
    }

    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(User.class, id));
    }
}
