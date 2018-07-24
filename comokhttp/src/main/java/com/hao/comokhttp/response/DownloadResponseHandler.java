package com.hao.comokhttp.response;

import java.io.File;

/**
* @作者 hao
* @创建日期 2018-7-24 16:05
* Description: 下载回调
*/
public abstract class DownloadResponseHandler {

    public abstract void onFinish(File download_file);
    public abstract void onProgress(long currentBytes, long totalBytes);
    public abstract void onFailure(String error_msg);
}
