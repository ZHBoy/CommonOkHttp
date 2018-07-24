package com.hao.comokhttp.response;

/**
* @作者 hao
* @创建日期 2018-7-24 16:06
* Description:
*/
public interface IResponseHandler {

    void onFailure(int statusCode, String error_msg);

    void onProgress(long currentBytes, long totalBytes);
}
