package cn.boy2b.common;

/**
 * @author zhouwei
 * @desc BizException
 * @date 2019-6-27 18:03
 */
public class BizException extends RuntimeException {

    public BizException() {
        super();
    }

    public BizException(String msg) {
        super(msg);
    }

    public BizException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
