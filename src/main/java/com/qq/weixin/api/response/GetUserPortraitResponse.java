package com.qq.weixin.api.response;
@SuppressWarnings("unused")
public class GetUserPortraitResponse {
    private String ref_date;
    private Visit_uv_new visit_uv_new;
    private Visit_uv visit_uv;

    public static class Province{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class City{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class Genders{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class Platforms{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class Devices{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class Ages{
        private int id;
        private String name;
        private int access_source_visit_uv;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccess_source_visit_uv() {
            return access_source_visit_uv;
        }

        public void setAccess_source_visit_uv(int access_source_visit_uv) {
            this.access_source_visit_uv = access_source_visit_uv;
        }
    }

    public static class Visit_uv_new{
        private int index;
        private Province province;
        private City city;
        private Genders genders;
        private Platforms platforms;
        private Devices devices;
        private Ages ages;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Province getProvince() {
            return province;
        }

        public void setProvince(Province province) {
            this.province = province;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public Genders getGenders() {
            return genders;
        }

        public void setGenders(Genders genders) {
            this.genders = genders;
        }

        public Platforms getPlatforms() {
            return platforms;
        }

        public void setPlatforms(Platforms platforms) {
            this.platforms = platforms;
        }

        public Devices getDevices() {
            return devices;
        }

        public void setDevices(Devices devices) {
            this.devices = devices;
        }

        public Ages getAges() {
            return ages;
        }

        public void setAges(Ages ages) {
            this.ages = ages;
        }
    }

    public static class Visit_uv{
        private int index;
        private Province province;
        private City city;
        private Genders genders;
        private Platforms platforms;
        private Devices devices;
        private Ages ages;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Province getProvince() {
            return province;
        }

        public void setProvince(Province province) {
            this.province = province;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public Genders getGenders() {
            return genders;
        }

        public void setGenders(Genders genders) {
            this.genders = genders;
        }

        public Platforms getPlatforms() {
            return platforms;
        }

        public void setPlatforms(Platforms platforms) {
            this.platforms = platforms;
        }

        public Devices getDevices() {
            return devices;
        }

        public void setDevices(Devices devices) {
            this.devices = devices;
        }

        public Ages getAges() {
            return ages;
        }

        public void setAges(Ages ages) {
            this.ages = ages;
        }
    }

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public Visit_uv_new getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(Visit_uv_new visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    public Visit_uv getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(Visit_uv visit_uv) {
        this.visit_uv = visit_uv;
    }
}
