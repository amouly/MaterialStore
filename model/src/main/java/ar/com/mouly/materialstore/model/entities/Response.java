package ar.com.mouly.materialstore.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author amouly on 4/19/15.
 */
public class Response {
    @SerializedName("data")
    private Data data;
    @SerializedName("cursor")
    private Cursor cursor;
    @SerializedName("facets")
    private Facet[] facets;
    @SerializedName("categories")
    private Category[] categories;
    @SerializedName("warnings")
    private Warning[] warnings;
    @SerializedName("errors")
    private Error[] errors;
    @SerializedName("exceptions")
    private Exception[] exceptions;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public Facet[] getFacets() {
        return facets;
    }

    public void setFacets(Facet[] facets) {
        this.facets = facets;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Warning[] getWarnings() {
        return warnings;
    }

    public void setWarnings(Warning[] warnings) {
        this.warnings = warnings;
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }

    public Exception[] getExceptions() {
        return exceptions;
    }

    public void setExceptions(Exception[] exceptions) {
        this.exceptions = exceptions;
    }
}