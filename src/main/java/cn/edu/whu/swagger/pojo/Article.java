package cn.edu.whu.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "article对象", description = "新增&更新文章对象说明")
public class Article {
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "id", value = "文章ID", required = false, example = "1")
    private Long id;


    @ApiModelProperty(name = "title", value = "文章标题", required = true, example = "测试文章标题")
    private String title;


    @ApiModelProperty(name = "summary", value = "文章摘要", required = true, example = "测试文章摘要")
    private String summary;


    @ApiModelProperty(hidden = true)
    private Date createTime;


    @ApiModelProperty(hidden = true)
    private Date publicTime;


    @ApiModelProperty(hidden = true)
    private Date updateTime;


    @ApiModelProperty(hidden = true)
    private Long userId;


    @ApiModelProperty(name = "status", value = "文章发布状态", required = true, example = "1")
    private Integer status;


    @ApiModelProperty(name = "type", value = "文章分类", required = true, example = "1")
    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}