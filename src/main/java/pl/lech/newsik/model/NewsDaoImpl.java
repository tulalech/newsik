package pl.lech.newsik.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class NewsDaoImpl implements NewsDao{

    private JdbcTemplate jdbcTemplate;
    String sql = "SELECT * FROM newsiki";

    @Autowired
    public NewsDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Article> getWebArticle() {
        return null;
    }

    @Override
    public List<Article> getDBArticle() {
        List<Article> carList = new ArrayList<>();
        List<Map<String, Object>> mapArticles = jdbcTemplate.queryForList(sql);
        return null;
    }

    @Override
    public void saveArticle(Article article) {
        String sql = "INSERT INTO newsiki (source, author, title, url, description) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                String.valueOf(article.getSource()),
                String.valueOf(article.getAuthor()),
                String.valueOf(article.getTitle()),
                String.valueOf(article.getUrl()),
                String.valueOf(article.getDescription())
        );
    }
}
