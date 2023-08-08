# VpsApi

All URIs are relative to *https://cloudapp.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateVpsWithForm**](VpsApi.md#updateVpsWithForm) | **POST** /vps/{vpsid} | Updates a vps info with form data

<a name="updateVpsWithForm"></a>
# **updateVpsWithForm**
> updateVpsWithForm(vpsid, ram, cpu, storage, os, ip)

Updates a vps info with form data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VpsApi;


VpsApi apiInstance = new VpsApi();
Long vpsid = 789L; // Long | ID of vps that needs to be updated
Long ram = 789L; // Long | Amount of ram for vps
Integer cpu = 56; // Integer | Amount of cpu for vps
Long storage = 789L; // Long | Amount of storage for vps
String os = "os_example"; // String | os of vps
String ip = "ip_example"; // String | ip of vps
try {
    apiInstance.updateVpsWithForm(vpsid, ram, cpu, storage, os, ip);
} catch (ApiException e) {
    System.err.println("Exception when calling VpsApi#updateVpsWithForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vpsid** | **Long**| ID of vps that needs to be updated |
 **ram** | **Long**| Amount of ram for vps |
 **cpu** | **Integer**| Amount of cpu for vps |
 **storage** | **Long**| Amount of storage for vps |
 **os** | **String**| os of vps |
 **ip** | **String**| ip of vps |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

