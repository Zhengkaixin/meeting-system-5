package com.team.meetingsystem.model;

/**
 *
 * @date 2021/03/27
 */
public class ResponseMessage {
    private Integer code;
    private String message;
    private Object data;


    public ResponseMessage(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseMessage success(Object data){
        return new ResponseMessage(200, "OK", data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
