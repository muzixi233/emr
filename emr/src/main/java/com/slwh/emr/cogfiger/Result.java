package com.slwh.emr.cogfiger;

/**
 * 定义还回格式·
 */
public class Result {
    private boolean ret;

    private String msg;

    private Object data;
    public Result (boolean ret){
        this.ret=ret;
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success(Object object,String msg){
        Result result = new Result(true);
        result.data=object;
        result.msg=msg;
        return  result;
    }

    public static Result success(Object object){
        Result result = new Result(true);
        result.data=object;
        return  result;
    }
    public static Result success(){
        Result result = new Result(true);

        return  result;
    }
    public static Result fail(String msg){
        Result result = new Result(false);
        result.msg=msg;
        return  result;
    }

}
