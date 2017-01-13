package tada.service;

import tada.model.Todo;

import java.util.List;

/**
 * Created by andriis on 1/13/17.
 */
public interface TodoService {
    public void addItem(String item);

    public List<Todo> listTodos();
}
