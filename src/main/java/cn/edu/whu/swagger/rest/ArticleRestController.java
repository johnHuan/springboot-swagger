package cn.edu.whu.swagger.rest;

import cn.edu.whu.swagger.pojo.Article;
import cn.edu.whu.swagger.pojo.WebResponse;
import cn.edu.whu.swagger.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/rest/article", method = RequestMethod.POST, produces = "application/json")
    public WebResponse saveArticle(@RequestBody Article article) {
        article.setUserId(1L);
        articleService.saveArticle(article);
        Map<String, Object> ret = new HashMap<>();
        ret.put("msg", "success");
        WebResponse response = new WebResponse();
        response.setSuccessResponse(ret);
        return response;
    }

    @RequestMapping(value = "/rest/article/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public WebResponse deleteArticle(@PathVariable Long id) {
        Article article = articleService.getById(id);
        article.setStatus(-1);
        articleService.updateArticle(article);
        WebResponse response = new WebResponse();
        HashMap<String, Object> res = new HashMap<>();
        res.put("msg", "delete article success");
        response.setSuccessResponse(res);
        return response;
    }

    @RequestMapping(value = "/rest/article/{id}", method = RequestMethod.PUT, produces = "application/json")
    public WebResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        articleService.updateArticle(article);
        WebResponse response = new WebResponse();
        HashMap<String, Object> res = new HashMap<>();
        res.put("msg", "update article success");
        response.setSuccessResponse(res);
        return response;
    }

    @RequestMapping(value = "/rest/article/{id}", method = RequestMethod.GET, produces = "application/json")
    public WebResponse getArticle(@PathVariable Long id) {
        Article article = articleService.getById(id);
        HashMap<String, Object> res = new HashMap<>();
        res.put("msg", article);
        WebResponse response = new WebResponse();
        response.setSuccessResponse(res);
        return response;
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET, produces = "application/json")
    public WebResponse getNoApi(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "test not parameter");
        WebResponse response = new WebResponse();
        response.setSuccessResponse(map);
        return response;
    }

}
