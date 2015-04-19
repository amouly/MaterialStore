package ar.com.mouly.materialstore.model.rest;

import ar.com.mouly.materialstore.model.entities.Response;
import ar.com.mouly.materialstore.model.entities.SortType;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * <h1>Interface for StoreFont REST API</h1>
 * @author amouly on 3/29/15.
 */
public interface StorefrontApi {

    /**
     * <h1>Products Collection</h1>
     * <p>List all Products.</p>
     * @param categoryIds   (O) Numeric categoryIds of products to be retrieved. All products with
     *                          the associated category will be returned in the JSON. Example: 10.
     * @param slug          (O) String slug of the product, which is the search engine optimized
     *                          URL keywords. Example: nike-air-jordan-2015-shoe.
     * @param search        (O) A searchable String for locating a produce. Only the first four
     *                          words separated by spaces are used. Example: nike air jordan.
     * @param facets        (O) String of facet IDs to filter and return products in the call.
     *                          These IDs correspond to facets, or filter categories, you have
     *                          set up in your storefront.
     * @param minPrice      (O) Numeric minPrice of products to be retrieved. This helps set the
     *                          price range. Example: 25.
     * @param maxPrice      (O) Numeric maxPrice of products to be retrieved. This helps set the
     *                          price range. Example: 100.
     * @param accessoriesOf (O) Used to retrieve accessory products of specified product code(s).
     *                          Example: ah-chair.
     * @param sort          (O) Sort order keyword of either relevance, lowest price, highest price,
     *                          newest, oldest, or popularity. Example: relevance.
     * @param pageNumber    (O) Numeric pageNumber of products to be retrieved. Example: 1.
     * @param pageSize      (O) Numeric pageSize of products to be retrieved. Example: 10.
     * @param cb            Callback to be executed when the response finish.
     */
    @GET("/products")
    void getProducts(@Query("categoryIds") Integer categoryIds,
                     @Query("slug") String slug,
                     @Query("search") String search,
                     @Query("facets") String facets,
                     @Query("minPrice") Integer minPrice,
                     @Query("maxPrice") Integer maxPrice,
                     @Query("accessoriesOf") String accessoriesOf,
                     @Query("sort") SortType sort,
                     @Query("pageNumber") Integer pageNumber,
                     @Query("pageSize") Integer pageSize,
                     Callback<Response> cb);

    /**
     * <h1>Product</h1>
     * <p>Gets a specific product by Code.</p>
     * @param code          (R) Alphanumeric code of the Product to perform action with.
     *                          This is the code entered when creating the product.
     *                          Example: jewel-front-sweatshirt.
     * @param cb            Callback to be executed when the response finish.
     */
    @GET("/products/{code}")
    void getProductByCode(@Path("code") String code,
                    Callback<Response> cb);

    /**
     * <h1>Product</h1>
     * <p>Gets a specific product by Slug.</p>
     * @param slug          (R) Alphanumeric slug of the Product to perform action with.
     *                          Has example value. Example: jewel-front-sweatshirt.
     * @param cb            Callback to be executed when the response finish.
     */
    @GET("/products")
    void getProductBySlug(@Query("slug") String slug,
                    Callback<Response> cb);

    /**
     * <h1>Product Reviews</h1>
     * <p>List product reviews.</p>
     * @param code          (R) Alphanumeric code of the Product to perform action with.
     *                          Has example value. Example: tiny-mermaid-slub-tee.
     * @param cb            Callback to be executed when the response finish.
     */
    @GET("/products/{code}/reviews")
    void getProductReviews(@Query("code") String code,
                          Callback<Response> cb);
}
