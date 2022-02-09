# NotificationListenersClientSideApi

All URIs are relative to *http://localhost:8080/tmf-api/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listenToCatalogAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToCatalogAttributeValueChangeEvent) | **POST** /listener/catalogAttributeValueChangeEvent | Client listener for entity CatalogAttributeValueChangeEvent
[**listenToCatalogBatchEvent**](NotificationListenersClientSideApi.md#listenToCatalogBatchEvent) | **POST** /listener/catalogBatchEvent | Client listener for entity CatalogBatchEvent
[**listenToCatalogCreateEvent**](NotificationListenersClientSideApi.md#listenToCatalogCreateEvent) | **POST** /listener/catalogCreateEvent | Client listener for entity CatalogCreateEvent
[**listenToCatalogDeleteEvent**](NotificationListenersClientSideApi.md#listenToCatalogDeleteEvent) | **POST** /listener/catalogDeleteEvent | Client listener for entity CatalogDeleteEvent
[**listenToCatalogStateChangeEvent**](NotificationListenersClientSideApi.md#listenToCatalogStateChangeEvent) | **POST** /listener/catalogStateChangeEvent | Client listener for entity CatalogStateChangeEvent
[**listenToCategoryAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToCategoryAttributeValueChangeEvent) | **POST** /listener/categoryAttributeValueChangeEvent | Client listener for entity CategoryAttributeValueChangeEvent
[**listenToCategoryCreateEvent**](NotificationListenersClientSideApi.md#listenToCategoryCreateEvent) | **POST** /listener/categoryCreateEvent | Client listener for entity CategoryCreateEvent
[**listenToCategoryDeleteEvent**](NotificationListenersClientSideApi.md#listenToCategoryDeleteEvent) | **POST** /listener/categoryDeleteEvent | Client listener for entity CategoryDeleteEvent
[**listenToCategoryStateChangeEvent**](NotificationListenersClientSideApi.md#listenToCategoryStateChangeEvent) | **POST** /listener/categoryStateChangeEvent | Client listener for entity CategoryStateChangeEvent
[**listenToProductOfferingAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingAttributeValueChangeEvent) | **POST** /listener/productOfferingAttributeValueChangeEvent | Client listener for entity ProductOfferingAttributeValueChangeEvent
[**listenToProductOfferingCreateEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingCreateEvent) | **POST** /listener/productOfferingCreateEvent | Client listener for entity ProductOfferingCreateEvent
[**listenToProductOfferingDeleteEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingDeleteEvent) | **POST** /listener/productOfferingDeleteEvent | Client listener for entity ProductOfferingDeleteEvent
[**listenToProductOfferingPriceAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingPriceAttributeValueChangeEvent) | **POST** /listener/productOfferingPriceAttributeValueChangeEvent | Client listener for entity ProductOfferingPriceAttributeValueChangeEvent
[**listenToProductOfferingPriceCreateEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingPriceCreateEvent) | **POST** /listener/productOfferingPriceCreateEvent | Client listener for entity ProductOfferingPriceCreateEvent
[**listenToProductOfferingPriceDeleteEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingPriceDeleteEvent) | **POST** /listener/productOfferingPriceDeleteEvent | Client listener for entity ProductOfferingPriceDeleteEvent
[**listenToProductOfferingPriceStateChangeEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingPriceStateChangeEvent) | **POST** /listener/productOfferingPriceStateChangeEvent | Client listener for entity ProductOfferingPriceStateChangeEvent
[**listenToProductOfferingStateChangeEvent**](NotificationListenersClientSideApi.md#listenToProductOfferingStateChangeEvent) | **POST** /listener/productOfferingStateChangeEvent | Client listener for entity ProductOfferingStateChangeEvent
[**listenToProductSpecificationAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToProductSpecificationAttributeValueChangeEvent) | **POST** /listener/productSpecificationAttributeValueChangeEvent | Client listener for entity ProductSpecificationAttributeValueChangeEvent
[**listenToProductSpecificationCreateEvent**](NotificationListenersClientSideApi.md#listenToProductSpecificationCreateEvent) | **POST** /listener/productSpecificationCreateEvent | Client listener for entity ProductSpecificationCreateEvent
[**listenToProductSpecificationDeleteEvent**](NotificationListenersClientSideApi.md#listenToProductSpecificationDeleteEvent) | **POST** /listener/productSpecificationDeleteEvent | Client listener for entity ProductSpecificationDeleteEvent
[**listenToProductSpecificationStateChangeEvent**](NotificationListenersClientSideApi.md#listenToProductSpecificationStateChangeEvent) | **POST** /listener/productSpecificationStateChangeEvent | Client listener for entity ProductSpecificationStateChangeEvent


<a name="listenToCatalogAttributeValueChangeEvent"></a>
# **listenToCatalogAttributeValueChangeEvent**
> EventSubscription listenToCatalogAttributeValueChangeEvent(data)

Client listener for entity CatalogAttributeValueChangeEvent

Example of a client listener for receiving the notification CatalogAttributeValueChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CatalogAttributeValueChangeEvent data = new CatalogAttributeValueChangeEvent(); // CatalogAttributeValueChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCatalogAttributeValueChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCatalogAttributeValueChangeEvent");
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
 **data** | [**CatalogAttributeValueChangeEvent**](CatalogAttributeValueChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCatalogBatchEvent"></a>
# **listenToCatalogBatchEvent**
> EventSubscription listenToCatalogBatchEvent(data)

Client listener for entity CatalogBatchEvent

Example of a client listener for receiving the notification CatalogBatchEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CatalogBatchEvent data = new CatalogBatchEvent(); // CatalogBatchEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCatalogBatchEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCatalogBatchEvent");
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
 **data** | [**CatalogBatchEvent**](CatalogBatchEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCatalogCreateEvent"></a>
# **listenToCatalogCreateEvent**
> EventSubscription listenToCatalogCreateEvent(data)

Client listener for entity CatalogCreateEvent

Example of a client listener for receiving the notification CatalogCreateEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CatalogCreateEvent data = new CatalogCreateEvent(); // CatalogCreateEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCatalogCreateEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCatalogCreateEvent");
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
 **data** | [**CatalogCreateEvent**](CatalogCreateEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCatalogDeleteEvent"></a>
# **listenToCatalogDeleteEvent**
> EventSubscription listenToCatalogDeleteEvent(data)

Client listener for entity CatalogDeleteEvent

Example of a client listener for receiving the notification CatalogDeleteEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CatalogDeleteEvent data = new CatalogDeleteEvent(); // CatalogDeleteEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCatalogDeleteEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCatalogDeleteEvent");
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
 **data** | [**CatalogDeleteEvent**](CatalogDeleteEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCatalogStateChangeEvent"></a>
# **listenToCatalogStateChangeEvent**
> EventSubscription listenToCatalogStateChangeEvent(data)

Client listener for entity CatalogStateChangeEvent

Example of a client listener for receiving the notification CatalogStateChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CatalogStateChangeEvent data = new CatalogStateChangeEvent(); // CatalogStateChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCatalogStateChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCatalogStateChangeEvent");
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
 **data** | [**CatalogStateChangeEvent**](CatalogStateChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCategoryAttributeValueChangeEvent"></a>
# **listenToCategoryAttributeValueChangeEvent**
> EventSubscription listenToCategoryAttributeValueChangeEvent(data)

Client listener for entity CategoryAttributeValueChangeEvent

Example of a client listener for receiving the notification CategoryAttributeValueChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CategoryAttributeValueChangeEvent data = new CategoryAttributeValueChangeEvent(); // CategoryAttributeValueChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCategoryAttributeValueChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCategoryAttributeValueChangeEvent");
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
 **data** | [**CategoryAttributeValueChangeEvent**](CategoryAttributeValueChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCategoryCreateEvent"></a>
# **listenToCategoryCreateEvent**
> EventSubscription listenToCategoryCreateEvent(data)

Client listener for entity CategoryCreateEvent

Example of a client listener for receiving the notification CategoryCreateEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CategoryCreateEvent data = new CategoryCreateEvent(); // CategoryCreateEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCategoryCreateEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCategoryCreateEvent");
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
 **data** | [**CategoryCreateEvent**](CategoryCreateEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCategoryDeleteEvent"></a>
# **listenToCategoryDeleteEvent**
> EventSubscription listenToCategoryDeleteEvent(data)

Client listener for entity CategoryDeleteEvent

Example of a client listener for receiving the notification CategoryDeleteEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CategoryDeleteEvent data = new CategoryDeleteEvent(); // CategoryDeleteEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCategoryDeleteEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCategoryDeleteEvent");
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
 **data** | [**CategoryDeleteEvent**](CategoryDeleteEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToCategoryStateChangeEvent"></a>
# **listenToCategoryStateChangeEvent**
> EventSubscription listenToCategoryStateChangeEvent(data)

Client listener for entity CategoryStateChangeEvent

Example of a client listener for receiving the notification CategoryStateChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    CategoryStateChangeEvent data = new CategoryStateChangeEvent(); // CategoryStateChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToCategoryStateChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToCategoryStateChangeEvent");
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
 **data** | [**CategoryStateChangeEvent**](CategoryStateChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingAttributeValueChangeEvent"></a>
# **listenToProductOfferingAttributeValueChangeEvent**
> EventSubscription listenToProductOfferingAttributeValueChangeEvent(data)

Client listener for entity ProductOfferingAttributeValueChangeEvent

Example of a client listener for receiving the notification ProductOfferingAttributeValueChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingAttributeValueChangeEvent data = new ProductOfferingAttributeValueChangeEvent(); // ProductOfferingAttributeValueChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingAttributeValueChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingAttributeValueChangeEvent");
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
 **data** | [**ProductOfferingAttributeValueChangeEvent**](ProductOfferingAttributeValueChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingCreateEvent"></a>
# **listenToProductOfferingCreateEvent**
> EventSubscription listenToProductOfferingCreateEvent(data)

Client listener for entity ProductOfferingCreateEvent

Example of a client listener for receiving the notification ProductOfferingCreateEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingCreateEvent data = new ProductOfferingCreateEvent(); // ProductOfferingCreateEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingCreateEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingCreateEvent");
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
 **data** | [**ProductOfferingCreateEvent**](ProductOfferingCreateEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingDeleteEvent"></a>
# **listenToProductOfferingDeleteEvent**
> EventSubscription listenToProductOfferingDeleteEvent(data)

Client listener for entity ProductOfferingDeleteEvent

Example of a client listener for receiving the notification ProductOfferingDeleteEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingDeleteEvent data = new ProductOfferingDeleteEvent(); // ProductOfferingDeleteEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingDeleteEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingDeleteEvent");
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
 **data** | [**ProductOfferingDeleteEvent**](ProductOfferingDeleteEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingPriceAttributeValueChangeEvent"></a>
# **listenToProductOfferingPriceAttributeValueChangeEvent**
> EventSubscription listenToProductOfferingPriceAttributeValueChangeEvent(data)

Client listener for entity ProductOfferingPriceAttributeValueChangeEvent

Example of a client listener for receiving the notification ProductOfferingPriceAttributeValueChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingPriceAttributeValueChangeEvent data = new ProductOfferingPriceAttributeValueChangeEvent(); // ProductOfferingPriceAttributeValueChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingPriceAttributeValueChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingPriceAttributeValueChangeEvent");
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
 **data** | [**ProductOfferingPriceAttributeValueChangeEvent**](ProductOfferingPriceAttributeValueChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingPriceCreateEvent"></a>
# **listenToProductOfferingPriceCreateEvent**
> EventSubscription listenToProductOfferingPriceCreateEvent(data)

Client listener for entity ProductOfferingPriceCreateEvent

Example of a client listener for receiving the notification ProductOfferingPriceCreateEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingPriceCreateEvent data = new ProductOfferingPriceCreateEvent(); // ProductOfferingPriceCreateEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingPriceCreateEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingPriceCreateEvent");
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
 **data** | [**ProductOfferingPriceCreateEvent**](ProductOfferingPriceCreateEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingPriceDeleteEvent"></a>
# **listenToProductOfferingPriceDeleteEvent**
> EventSubscription listenToProductOfferingPriceDeleteEvent(data)

Client listener for entity ProductOfferingPriceDeleteEvent

Example of a client listener for receiving the notification ProductOfferingPriceDeleteEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingPriceDeleteEvent data = new ProductOfferingPriceDeleteEvent(); // ProductOfferingPriceDeleteEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingPriceDeleteEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingPriceDeleteEvent");
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
 **data** | [**ProductOfferingPriceDeleteEvent**](ProductOfferingPriceDeleteEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingPriceStateChangeEvent"></a>
# **listenToProductOfferingPriceStateChangeEvent**
> EventSubscription listenToProductOfferingPriceStateChangeEvent(data)

Client listener for entity ProductOfferingPriceStateChangeEvent

Example of a client listener for receiving the notification ProductOfferingPriceStateChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingPriceStateChangeEvent data = new ProductOfferingPriceStateChangeEvent(); // ProductOfferingPriceStateChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingPriceStateChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingPriceStateChangeEvent");
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
 **data** | [**ProductOfferingPriceStateChangeEvent**](ProductOfferingPriceStateChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductOfferingStateChangeEvent"></a>
# **listenToProductOfferingStateChangeEvent**
> EventSubscription listenToProductOfferingStateChangeEvent(data)

Client listener for entity ProductOfferingStateChangeEvent

Example of a client listener for receiving the notification ProductOfferingStateChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductOfferingStateChangeEvent data = new ProductOfferingStateChangeEvent(); // ProductOfferingStateChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductOfferingStateChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductOfferingStateChangeEvent");
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
 **data** | [**ProductOfferingStateChangeEvent**](ProductOfferingStateChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductSpecificationAttributeValueChangeEvent"></a>
# **listenToProductSpecificationAttributeValueChangeEvent**
> EventSubscription listenToProductSpecificationAttributeValueChangeEvent(data)

Client listener for entity ProductSpecificationAttributeValueChangeEvent

Example of a client listener for receiving the notification ProductSpecificationAttributeValueChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductSpecificationAttributeValueChangeEvent data = new ProductSpecificationAttributeValueChangeEvent(); // ProductSpecificationAttributeValueChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductSpecificationAttributeValueChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductSpecificationAttributeValueChangeEvent");
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
 **data** | [**ProductSpecificationAttributeValueChangeEvent**](ProductSpecificationAttributeValueChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductSpecificationCreateEvent"></a>
# **listenToProductSpecificationCreateEvent**
> EventSubscription listenToProductSpecificationCreateEvent(data)

Client listener for entity ProductSpecificationCreateEvent

Example of a client listener for receiving the notification ProductSpecificationCreateEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductSpecificationCreateEvent data = new ProductSpecificationCreateEvent(); // ProductSpecificationCreateEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductSpecificationCreateEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductSpecificationCreateEvent");
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
 **data** | [**ProductSpecificationCreateEvent**](ProductSpecificationCreateEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductSpecificationDeleteEvent"></a>
# **listenToProductSpecificationDeleteEvent**
> EventSubscription listenToProductSpecificationDeleteEvent(data)

Client listener for entity ProductSpecificationDeleteEvent

Example of a client listener for receiving the notification ProductSpecificationDeleteEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductSpecificationDeleteEvent data = new ProductSpecificationDeleteEvent(); // ProductSpecificationDeleteEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductSpecificationDeleteEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductSpecificationDeleteEvent");
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
 **data** | [**ProductSpecificationDeleteEvent**](ProductSpecificationDeleteEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="listenToProductSpecificationStateChangeEvent"></a>
# **listenToProductSpecificationStateChangeEvent**
> EventSubscription listenToProductSpecificationStateChangeEvent(data)

Client listener for entity ProductSpecificationStateChangeEvent

Example of a client listener for receiving the notification ProductSpecificationStateChangeEvent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationListenersClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/tmf-api/productCatalogManagement/v4");

    NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi(defaultClient);
    ProductSpecificationStateChangeEvent data = new ProductSpecificationStateChangeEvent(); // ProductSpecificationStateChangeEvent | The event data
    try {
      EventSubscription result = apiInstance.listenToProductSpecificationStateChangeEvent(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationListenersClientSideApi#listenToProductSpecificationStateChangeEvent");
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
 **data** | [**ProductSpecificationStateChangeEvent**](ProductSpecificationStateChangeEvent.md)| The event data |

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
**201** | Notified |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

