package ar.com.mouly.materialstore.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author amouly on 4/19/15.
 */
public class Error {
    @SerializedName("message")
    private String message;
    @SerializedName("relatedToField")
    private String relatedToField;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRelatedToField() {
        return relatedToField;
    }

    public void setRelatedToField(String relatedToField) {
        this.relatedToField = relatedToField;
    }
}
