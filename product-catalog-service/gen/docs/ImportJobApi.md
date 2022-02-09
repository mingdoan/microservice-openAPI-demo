# ImportJobApi

All URIs are relative to *http://localhost:8080/tmf-api/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImportJob**](ImportJobApi.md#createImportJob) | **POST** /importJob | Creates a ImportJob
[**deleteImportJob**](ImportJobApi.md#deleteImportJob) | **DELETE** /importJob/{id} | Deletes a ImportJob
[**listImportJob**](ImportJobApi.md#listImportJob) | **GET** /importJob | List or find ImportJob objects
[**retrieveImportJob**](ImportJobApi.md#retrieveImportJob) | **GET** /importJob/{id} | Retrieves a ImportJob by ID


<a name="createImportJob"></a>
# **createImportJob**
> ImportJob createImportJob(importJob)

Creates a ImportJob

This operation creates a ImportJob entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ImportJobApi apiInstance = new ImportJobApi(defaultClient);
    ImportJobCreate importJob = new ImportJobCreate(); // ImportJobCreate | The ImportJob to be created
    try {
      ImportJob result = apiInstance.createImportJob(importJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportJobApi#createImportJob");
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
 **importJob** | [**ImportJobCreate**](ImportJobCreate.md)| The ImportJob to be created |

### Return type

[**ImportJob**](ImportJob.md)

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

<a name="deleteImportJob"></a>
# **deleteImportJob**
> deleteImportJob(id)

Deletes a ImportJob

This operation deletes a ImportJob entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ImportJobApi apiInstance = new ImportJobApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ImportJob
    try {
      apiInstance.deleteImportJob(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportJobApi#deleteImportJob");
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
 **id** | **String**| Identifier of the ImportJob |

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

<a name="listImportJob"></a>
# **listImportJob**
> List&lt;ImportJob&gt; listImportJob(fields, offset, limit)

List or find ImportJob objects

This operation list or find ImportJob entities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ImportJobApi apiInstance = new ImportJobApi(defaultClient);
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      List<ImportJob> result = apiInstance.listImportJob(fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportJobApi#listImportJob");
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

[**List&lt;ImportJob&gt;**](ImportJob.md)

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

<a name="retrieveImportJob"></a>
# **retrieveImportJob**
> ImportJob retrieveImportJob(id, fields)

Retrieves a ImportJob by ID

This operation retrieves a ImportJob entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ImportJobApi apiInstance = new ImportJobApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ImportJob
    String fields = "fields_example"; // String | Comma-separated properties to provide in response
    try {
      ImportJob result = apiInstance.retrieveImportJob(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportJobApi#retrieveImportJob");
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
 **id** | **String**| Identifier of the ImportJob |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ImportJob**](ImportJob.md)

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

