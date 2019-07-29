package cn.boy2b.module.common.vo;

/**
 *@desc ResultVO
 *@author zhouwei
 *@date 2019/7/29 17:13
 */
public class ResultVO {

    public static final int SUCCESS = 1;
    public static final int FAIL = 0;

    /**
     *@desc 返回状态。1:成功；0:失败
     */
    private int status = 0;

    /**
     *@desc 失败时的错误信息
     */
    private String msg = null;

    /**
     *@desc 成功时返回的对象
     */
    private Object data;

    public ResultVO () {

    }

    public ResultVO (int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVO createSuccess(Object data) {
         return new ResultVO(SUCCESS, null, data);
    }

    public static ResultVO createSuccess() {
        return new ResultVO(SUCCESS, null, null);
    }

    public static ResultVO createFail(String msg) {
        return new ResultVO(FAIL, msg, null);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
}
