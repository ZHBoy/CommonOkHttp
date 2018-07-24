package com.hao.comokhttp.response;

import org.json.JSONObject;

/**
* @作者 hao
* @创建日期 2018-7-24 16:06
* Description: json类型的回调接口
*/
public abstract class JsonResponseHandler implements IResponseHandler {

    public abstract void onSuccess(int statusCode, JSONObject response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
