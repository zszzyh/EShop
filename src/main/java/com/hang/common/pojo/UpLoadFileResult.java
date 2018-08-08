package com.hang.common.pojo;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class UpLoadFileResult {
    private int error;
    private String message;
    private String url;

    public int getError() {
        return error;
    }

    public UpLoadFileResult setError(int error) {
        this.error = error;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UpLoadFileResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpLoadFileResult setUrl(String url) {
        this.url = url;
        return this;
    }
}
