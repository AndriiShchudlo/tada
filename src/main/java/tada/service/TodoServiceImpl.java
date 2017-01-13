package tada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tada.dao.TodoDao;
import tada.model.Todo;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by andriis on 1/13/17.
 */
@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    @Qualifier("todoDaoImpl")
    private TodoDao todoDao;

    public void setTodoDao(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    @Transactional
    public void addItem(String item) {
        this.todoDao.addItem(item);
    }

    @Override
    @Transactional
    public List<Todo> listTodos() {
        return todoDao.listTodos();
    }
}
