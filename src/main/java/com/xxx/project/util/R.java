package com.xxx.project.util;
import cn.hutool.core.date.DateUtil;


public class R<T> {

    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 失败
     */
    public static final int FAIL = 500;

    private int code;

    private String msg;

    private T data;

    public static <T> R<T> ok() {
        return restResult(null, SUCCESS, null);
    }

    public static <T> R<T> ok(T data) {
        return restResult(data, SUCCESS, "success");
    }

    public static R<?> success() {
        R<?> apiResult = new R<>();
        apiResult.setCode(SUCCESS);
        apiResult.setMsg("操作成功！");
        return apiResult;
    }

    public static <T> R<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> R<T> fail() {
        return restResult(null, FAIL, null);
    }

    public static <T> R<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> R<T> fail(T data) {
        return restResult(data, FAIL, null);
    }

    public static <T> R<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> R<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static R successOrNot(int n) {
        return restResult(n);
    }
    public static R successOrNot(Boolean bool) {
        return restResult(bool);
    }

    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    private static <T> R<T> restResult(Integer n) {
        R<T> apiResult = new R<>();
        if (n == null || n < 1) {
            apiResult.setCode(FAIL);
            apiResult.setMsg("操作失败！");
            return apiResult;
        }
        apiResult.setCode(SUCCESS);
        apiResult.setMsg("操作成功！");
        return apiResult;
    }

    private static <T> R<T> restResult(Boolean bool) {
        R<T> apiResult = new R<>();
        if (!bool) {
            apiResult.setCode(FAIL);
            apiResult.setMsg("操作失败！");
            return apiResult;
        }
        apiResult.setCode(SUCCESS);
        apiResult.setMsg("操作成功！");
        return apiResult;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Boolean isError(R<T> ret) {
        return !isSuccess(ret);
    }

    public static <T> Boolean isSuccess(R<T> ret) {
        return R.SUCCESS == ret.getCode();
    }
}

