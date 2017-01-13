package tada.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tada.model.Todo;


import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDaoImpl implements TodoDao {
    private static final Logger logger = LoggerFactory.getLogger(TodoDaoImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addItem(String item) {

    }

    @Override
    public List<Todo> listTodos() {

       Session session = sessionFactory.getCurrentSession();
        List<Todo> todoList = session.createQuery("SELECT a FROM Todo a").list();
//        List<Todo> todoList = new ArrayList<>();
        Todo f = new Todo();


        for(Todo todo: todoList){
            logger.info("Todo list: " + todo);
        }

        return todoList;
    }
}
