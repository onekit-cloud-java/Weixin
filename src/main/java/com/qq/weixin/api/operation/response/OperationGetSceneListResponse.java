package com.qq.weixin.api.operation.response;

import java.util.List;

public class OperationGetSceneListResponse {
    private List<Scene> scene;
    public static class Scene{
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public List<Scene> getScene() {
        return scene;
    }

    public void setScene(List<Scene> scene) {
        this.scene = scene;
    }
}
