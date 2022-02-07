# ExportJobApi

All URIs are relative to *http://localhost:8080/tmf-api/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExportJob**](ExportJobApi.md#createExportJob) | **POST** /exportJob | Creates a ExportJob
[**deleteExportJob**](ExportJobApi.md#deleteExportJob) | **DELETE** /exportJob/{id} | Deletes a ExportJob
[**listExportJob**](ExportJobApi.md#listExportJob) | **GET** /exportJob | List or find ExportJob objects
[**retrieveExportJob**](ExportJobApi.md#retrieveExportJob) | **GET** /exportJob/{id} | Retrieves a ExportJob by ID


<a name="createExportJob"></a>
# **createExportJob**
> ExportJob createExportJob(exportJob)

Creates a ExportJob

This operation creates a ExportJob entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ExportJobApi apiInstance = new ExportJobApi(defaultClient);
    ExportJobCreate exportJob = new ExportJobCreate(); // ExportJobCreate | The ExportJob to be created
    try {
      ExportJob result = apiInstance.createExportJob(exportJob);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportJobApi#createExportJob");
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
 **exportJob** | [**ExportJobCreate**](ExportJobCreate.md)| The ExportJob to be created |

### Return type

[**ExportJob**](ExportJob.md)

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

<a name="deleteExportJob"></a>
# **deleteExportJob**
> deleteExportJob(id)

Deletes a ExportJob

This operation deletes a ExportJob entity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ExportJobApi apiInstance = new ExportJobApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ExportJob
    try {
      apiInstance.deleteExportJob(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportJobApi#deleteExportJob");
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
 **id** | **String**| Identifier of the ExportJob |

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

<a name="listExportJob"></a>
# **listExportJob**
> List&lt;ExportJob&gt; listExportJob(fields, offset, limit)

List or find ExportJob objects

This operation list or find ExportJob entities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ExportJobApi apiInstance = new ExportJobApi(defaultClient);
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      List<ExportJob> result = apiInstance.listExportJob(fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportJobApi#listExportJob");
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

[**List&lt;ExportJob&gt;**](ExportJob.md)

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

<a name="retrieveExportJob"></a>
# **retrieveExportJob**
> ExportJob retrieveExportJob(id, fields)

Retrieves a ExportJob by ID

This operation retrieves a ExportJob entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExportJobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    ExportJobApi apiInstance = new ExportJobApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ExportJob
    String fields = "fields_example"; // String | Comma-separated properties to provide in response
    try {
      ExportJob result = apiInstance.retrieveExportJob(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportJobApi#retrieveExportJob");
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
 **id** | **String**| Identifier of the ExportJob |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ExportJob**](ExportJob.md)

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

