package api.mch.weixin.qq.com.v2.request;


@SuppressWarnings("unused")
public class PayNoticeRequest {
    private String id;
    private String create_time;
    private String event_type;
    private String resource_type;
    private String summary;
    private Resource resource;
    public static class Resource{
        private String algorithm;
        private String ciphertext;
        private String associated_data;
        private String nonce;
        private String original_type;

        public String getAlgorithm() {
            return algorithm;
        }

        public void setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
        }

        public String getCiphertext() {
            return ciphertext;
        }

        public void setCiphertext(String ciphertext) {
            this.ciphertext = ciphertext;
        }

        public String getAssociated_data() {
            return associated_data;
        }

        public void setAssociated_data(String associated_data) {
            this.associated_data = associated_data;
        }

        public String getNonce() {
            return nonce;
        }

        public void setNonce(String nonce) {
            this.nonce = nonce;
        }

        public String getOriginal_type() {
            return original_type;
        }

        public void setOriginal_type(String original_type) {
            this.original_type = original_type;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
