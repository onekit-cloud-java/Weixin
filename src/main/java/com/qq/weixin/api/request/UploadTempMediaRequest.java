package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class UploadTempMediaRequest {
    private String access_token;
    private FormData media;

    public static class FormData{
        private String filename;
        private String filelength;
        private String contentType;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getFilelength() {
            return filelength;
        }

        public void setFilelength(String filelength) {
            this.filelength = filelength;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }
    }

    public enum type{
        image
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public FormData getMedia() {
        return media;
    }

    public void setMedia(FormData media) {
        this.media = media;
    }
}
