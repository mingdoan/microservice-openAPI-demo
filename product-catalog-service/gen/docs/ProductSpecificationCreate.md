

# ProductSpecificationCreate

Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **String** | The manufacturer or trademark of the specification |  [optional]
**description** | **String** | A narrative that explains in detail what the product specification is |  [optional]
**isBundle** | **Boolean** | isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true). |  [optional]
**lastUpdate** | **OffsetDateTime** | Date and time of the last update |  [optional]
**lifecycleStatus** | **String** | Used to indicate the current lifecycle status |  [optional]
**name** | **String** | Name of the product specification | 
**productNumber** | **String** | An identification number assigned to uniquely identity the specification |  [optional]
**version** | **String** | Product specification version |  [optional]
**attachment** | [**List&lt;AttachmentRefOrValue&gt;**](AttachmentRefOrValue.md) | Complements the description of an element (for instance a product) through video, pictures... |  [optional]
**bundledProductSpecification** | [**List&lt;BundledProductSpecification&gt;**](BundledProductSpecification.md) | A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification. |  [optional]
**productSpecCharacteristic** | [**List&lt;ProductSpecificationCharacteristic&gt;**](ProductSpecificationCharacteristic.md) | A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process. |  [optional]
**productSpecificationRelationship** | [**List&lt;ProductSpecificationRelationship&gt;**](ProductSpecificationRelationship.md) | A migration, substitution, dependency or exclusivity relationship between/among product specifications. |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | A related party defines party or party role linked to a specific entity. |  [optional]
**resourceSpecification** | [**List&lt;ResourceSpecificationRef&gt;**](ResourceSpecificationRef.md) | The ResourceSpecification is required to realize a ProductSpecification. |  [optional]
**serviceSpecification** | [**List&lt;ServiceSpecificationRef&gt;**](ServiceSpecificationRef.md) | ServiceSpecification(s) required to realize a ProductSpecification. |  [optional]
**targetProductSchema** | [**TargetProductSchema**](TargetProductSchema.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | **URI** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class Extensible name |  [optional]



