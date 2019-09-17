package cn.edu.whu.swagger.service;

import cn.edu.whu.swagger.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleService {
    public void saveArticle(Article article) {

    }

    public Article getById(Long id) {
        Article article = new Article();
        article.setId(1L);
        article.setCreateTime(new Date());
        article.setPublicTime(new Date());
        article.setStatus(1);
        article.setSummary("summary");
        article.setTitle("title haha");
        article.setType(1);
        article.setUserId(2019102140020L);
        return article;
    }


    public void updateArticle(Article article) {

    }
}
