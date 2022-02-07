# EventsSubscriptionApi

All URIs are relative to *http://localhost:8080/tmf-api/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerListener**](EventsSubscriptionApi.md#registerListener) | **POST** /hub | Register a listener
[**unregisterListener**](EventsSubscriptionApi.md#unregisterListener) | **DELETE** /hub/{id} | Unregister a listener


<a name="registerListener"></a>
# **registerListener**
> EventSubscription registerListener(data)

Register a listener

Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    EventsSubscriptionApi apiInstance = new EventsSubscriptionApi(defaultClient);
    EventSubscriptionInput data = new EventSubscriptionInput(); // EventSubscriptionInput | Data containing the callback endpoint to deliver the information
    try {
      EventSubscription result = apiInstance.registerListener(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsSubscriptionApi#registerListener");
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
 **data** | [**EventSubscriptionInput**](EventSubscriptionInput.md)| Data containing the callback endpoint to deliver the information |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Subscribed |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="unregisterListener"></a>
# **unregisterListener**
> unregisterListener(id)

Unregister a listener

Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    EventsSubscriptionApi apiInstance = new EventsSubscriptionApi(defaultClient);
    String id = "id_example"; // String | The id of the registered listener
    try {
      apiInstance.unregisterListener(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsSubscriptionApi#unregisterListener");
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
 **id** | **String**| The id of the registered listener |

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
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method not allowed |  -  |
**500** | Internal Server Error |  -  |

