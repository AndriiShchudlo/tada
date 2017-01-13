package tada.dao;

import tada.model.Todo;

import java.util.List;

public interface TodoDao {
    public void addItem(String item);

    public List<Todo> listTodos();
}
