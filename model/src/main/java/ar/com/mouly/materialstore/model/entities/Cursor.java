package ar.com.mouly.materialstore.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author amouly on 4/19/15.
 */
public class Cursor {
    @SerializedName("total")
    private int total;
    @SerializedName("totalPages")
    private int totalPages;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("currentPage")
    private int currentPage;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
