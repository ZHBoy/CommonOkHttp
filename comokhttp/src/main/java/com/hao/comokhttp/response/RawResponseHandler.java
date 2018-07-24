package com.hao.comokhttp.response;

/**
* @作者 hao
* @创建日期 2018-7-24 16:07
* Description: 字符串结果回调
*/
public abstract class RawResponseHandler implements IResponseHandler {

    public abstract void onSuccess(int statusCode, String response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
