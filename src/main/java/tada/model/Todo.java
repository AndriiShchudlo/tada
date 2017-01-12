package tada.model;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "todo_name")
    private String todo_name;
    @Column(name = "item_name")
    private String item_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo_name() {
        return todo_name;
    }

    public void setTodo_name(String todo_name) {
        this.todo_name = todo_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo_name='" + todo_name + '\'' +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
