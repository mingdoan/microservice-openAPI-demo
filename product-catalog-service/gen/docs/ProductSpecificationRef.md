

# ProductSpecificationRef

Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier | 
**href** | **URI** | Hyperlink reference |  [optional]
**name** | **String** | Name of the related entity. |  [optional]
**version** | **String** | Version of the product specification |  [optional]
**targetProductSchema** | [**TargetProductSchema**](TargetProductSchema.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | **URI** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class Extensible name |  [optional]
**atReferredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



