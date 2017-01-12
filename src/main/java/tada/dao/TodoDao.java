package tada.dao;

import java.util.List;

public interface TodoDao {
public List<Todo> getTodo();
public void addItem(String item);
}
