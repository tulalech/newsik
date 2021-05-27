package pl.lech.newsik.model;

import java.util.List;

public interface NewsDao {

    List<Article> getWebArticle();
    List<Article> getDBArticle();
    void saveArticle(Article article);
}
