package ar.com.mouly.materialstore.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author amouly on 4/19/15.
 */
public class Data {
    @SerializedName("id")
    private int id;
    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("slug")
    private String slug;


}
