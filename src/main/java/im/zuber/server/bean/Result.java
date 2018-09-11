package im.zuber.server.bean;

/**
 * 请求响应结构
 *
 * Created by suntongwei on 17/10/21.
 */
public class Result<T> {

    /**
     * 成功响应
     */
    public static final int ERROR = -1;

    /**
     * 未登录或Token过期
     */
    public static final int SUCCESS = 0;

    public int code;
    public String msg;
    public T result;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
