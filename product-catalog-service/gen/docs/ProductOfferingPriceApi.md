# ProductOfferingPriceApi

All URIs are relative to *http://localhost:8080/tmf-api/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductOfferingPrice**](ProductOfferingPriceApi.md#createProductOfferingPrice) | **POST** /productOfferingPrice | Creates a ProductOfferingPrice
[**deleteProductOfferingPrice**](ProductOfferingPriceApi.md#deleteProductOfferingPrice) | **DELETE** /productOfferingPrice/{id} | Deletes a ProductOfferingPrice
[**listProductOfferingPrice**](ProductOfferingPriceApi.md#listProductOfferingPrice) | **GET** /productOfferingPrice | List or find ProductOfferingPrice objects
[**patchProductOfferingPrice**](ProductOfferingPriceApi.md#patchProductOfferingPrice) | **PATCH** /productOfferingPrice/{id} | Updates partially a ProductOfferingPrice
[**retrieveProductOfferingPrice**](ProductOfferingPriceApi.md#retrieveProductOfferingPrice) | **GET** /productOfferingPrice/{id} | Retrieves a ProductOfferingPrice by ID


<a name="createProductOfferingPrice"></a>
# **createProductOfferingPrice**
> ProductOfferingPrice createProductOfferingPrice(productOfferingPrice)

Creates a ProductOfferingPrice

This operation creates a ProductOfferingPrice entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingPriceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ProductOfferingPriceApi apiInstance = new ProductOfferingPriceApi(defaultClient);
    ProductOfferingPriceCreate productOfferingPrice = new ProductOfferingPriceCreate(); // ProductOfferingPriceCreate | The ProductOfferingPrice to be created
    try {
      ProductOfferingPrice result = apiInstance.createProductOfferingPrice(productOfferingPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingPriceApi#createProductOfferingPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productOfferingPrice** | [**ProductOfferingPriceCreate**](ProductOfferingPriceCreate.md)| The ProductOfferingPrice to be created |

### Return type

[**ProductOfferingPrice**](ProductOfferingPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteProductOfferingPrice"></a>
# **deleteProductOfferingPrice**
> deleteProductOfferingPrice(id)

Deletes a ProductOfferingPrice

This operation deletes a ProductOfferingPrice entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingPriceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ProductOfferingPriceApi apiInstance = new ProductOfferingPriceApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ProductOfferingPrice
    try {
      apiInstance.deleteProductOfferingPrice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingPriceApi#deleteProductOfferingPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ProductOfferingPrice |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Deleted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listProductOfferingPrice"></a>
# **listProductOfferingPrice**
> List&lt;ProductOfferingPrice&gt; listProductOfferingPrice(fields, offset, limit)

List or find ProductOfferingPrice objects

This operation list or find ProductOfferingPrice entities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingPriceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ProductOfferingPriceApi apiInstance = new ProductOfferingPriceApi(defaultClient);
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      List<ProductOfferingPrice> result = apiInstance.listProductOfferingPrice(fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingPriceApi#listProductOfferingPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;ProductOfferingPrice&gt;**](ProductOfferingPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-Total-Count - Total number of items matching criteria <br>  * X-Result-Count - Actual number of items returned in the response body <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="patchProductOfferingPrice"></a>
# **patchProductOfferingPrice**
> ProductOfferingPrice patchProductOfferingPrice(id, productOfferingPrice)

Updates partially a ProductOfferingPrice

This operation updates partially a ProductOfferingPrice entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingPriceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ProductOfferingPriceApi apiInstance = new ProductOfferingPriceApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ProductOfferingPrice
    ProductOfferingPriceUpdate productOfferingPrice = new ProductOfferingPriceUpdate(); // ProductOfferingPriceUpdate | The ProductOfferingPrice to be updated
    try {
      ProductOfferingPrice result = apiInstance.patchProductOfferingPrice(id, productOfferingPrice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingPriceApi#patchProductOfferingPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ProductOfferingPrice |
 **productOfferingPrice** | [**ProductOfferingPriceUpdate**](ProductOfferingPriceUpdate.md)| The ProductOfferingPrice to be updated |

### Return type

[**ProductOfferingPrice**](ProductOfferingPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="retrieveProductOfferingPrice"></a>
# **retrieveProductOfferingPrice**
> ProductOfferingPrice retrieveProductOfferingPrice(id, fields)

Retrieves a ProductOfferingPrice by ID

This operation retrieves a ProductOfferingPrice entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingPriceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ProductOfferingPriceApi apiInstance = new ProductOfferingPriceApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ProductOfferingPrice
    String fields = "fields_example"; // String | Comma-separated properties to provide in response
    try {
      ProductOfferingPrice result = apiInstance.retrieveProductOfferingPrice(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingPriceApi#retrieveProductOfferingPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ProductOfferingPrice |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ProductOfferingPrice**](ProductOfferingPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

