package rest.todo.dao;

import java.util.HashMap;
import java.util.Map;

import rest.todo.model.Article;


public enum TodoDao {
    instance;

    private Map<String, Article> contentProvider = new HashMap<>();

    private TodoDao() {
//HJH
        Article todo = new Article("1", "Prendre un bon petit d?j");
        todo.setDescription("il est important de commencer la journ?e par un repas ?quilibr?");
        contentProvider.put("1", todo);
        todo = new Article("2", "Faire 10000 pas");
        todo.setDescription("afin de garder une bonne sant?");
        contentProvider.put("2", todo);   

    }
    public Map<String, Article> getModel(){
        return contentProvider;
    }

}