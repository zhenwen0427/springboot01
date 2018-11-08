package springboot01.util;

/**
 * @author shkstart
 * @create 2018-11-08 13:43
 */

import java.io.Serializable;

/**
 * 返回到前台页面的JSON数据信息
 * @author navigator
 *
 */
public class JsonMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    //对于用户操作的正常和成功的信息
    private int error;
    //发送给前端，用于显示的成功或失败的消息
    private String errormsg;
    //数据
    private Object data;

    //指明Action跳转的是JSON响应数据
    //private static String JSON = "json";

    public JsonMessage(int error, String errormsg){
        this.error = error;
        this.errormsg = errormsg;
    }

    public JsonMessage(int error, Object data){
        this.error = error;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public int getError() {
        return error;
    }


    public void setError(int error) {
        this.error = error;
    }


    public String getErrormsg() {
        return errormsg;
    }


    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

}
