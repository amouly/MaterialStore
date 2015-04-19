package ar.com.mouly.materialstore.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author amouly on 4/19/15.
 */
public class Exception {
    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
