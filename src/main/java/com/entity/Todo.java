package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;
    private String title;
    private boolean completed;
    
    protected static Todo instance;

    public static Todo getInstance(){
        if (Todo.instance == null ) {
            Todo.instance = new Todo();
        }
        return Todo.instance;
    }
    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    public String getTitle (){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public boolean getCompleted(){
        return this.completed;
    }
    public void setCompleted( boolean completed){
        this.completed = completed;
    }
}
