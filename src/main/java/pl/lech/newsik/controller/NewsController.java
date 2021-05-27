package pl.lech.newsik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.lech.newsik.model.Article;
import pl.lech.newsik.model.News;
import pl.lech.newsik.model.NewsDao;
import pl.lech.newsik.model.Question;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
public class NewsController {

    private String apikey = "7608d175a6a84e15a99a5f04de291f42";

    private Question question;
    private List<News> newsList;
    private String url = "https://newsapi.org/v2/everything?apiKey=".concat(apikey).concat("&q=");
    private List<Article> articleList;
    private NewsDao newsDao;

    public NewsController(NewsDao newsDao) {
        this.newsDao = newsDao;
        this.newsList = new ArrayList<>();
        this.question = new Question();
        question.setSearchText("qawsedrf");
    }

    @GetMapping("/news")
    private String getNews(Model model) {
        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(url, String.class);
//        System.out.println(result);
        News news = restTemplate.getForObject(url.concat(question.getSearchText()), News.class);
        articleList = news.getArticles();
        model.addAttribute("articles", articleList);
        model.addAttribute("question", new Question());
        return "newslist";
    }

    @PostMapping("/searchnews")
    public String filterCar(@ModelAttribute Question search) {
        question.setSearchText(search.getSearchText());
        if (search.getSearchText().equalsIgnoreCase("")) {
            question.setSearchText("Bykowski");
        }
        return "redirect:/news";
    }

    @RequestMapping("/savenews/{id}")
    public String addArticle(@PathVariable(name = "id") int id) {
        System.out.println("Saving article ".concat(String.valueOf(id)));
        Article article = articleList.get(id);
        System.out.println(article.getDescription());
        newsDao.saveArticle(article);
        return "redirect:/news";
    }
}
