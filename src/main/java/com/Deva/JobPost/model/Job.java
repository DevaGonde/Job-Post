package com.Deva.JobPost.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Job {

    @Id
    private String _id;
    private String desc;
    private int exp;
    private String profile;
    private String []techs;

    public Job() {
    }

    public Job(String _id, String desc, int exp, String profile, String[] techs) {
        this._id = _id;
        this.desc = desc;
        this.exp = exp;
        this.profile = profile;
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                " id='" + _id + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }
}
