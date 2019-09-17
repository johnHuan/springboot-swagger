package cn.edu.whu.swagger.pojo;

import java.util.List;
import java.util.Map;

public class WebResponse {

    private Map<String,Object> successResponse;


    public Map<String, Object> getSuccessResponse() {
        return successResponse;
    }

    public void setSuccessResponse(Map<String, Object> successResponse) {
        this.successResponse = successResponse;
    }
}
