package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class ImgSecCheckRequest {
    private String access_token;
    private Media media;

    public static class Media{
        private String contentType;
        private byte[] value;

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public byte[] getValue() {
            return value;
        }

        public void setValue(byte[] value) {
            this.value = value;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
