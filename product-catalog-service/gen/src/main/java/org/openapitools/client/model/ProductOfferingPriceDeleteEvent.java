/*
 * Product Catalog Management
 * ## TMF API Reference: TMF620 - Product Catalog Management  ### Release : 20.5 - March 2021  Product Catalog API is one of Catalog Management API Family. Product Catalog API goal is to provide a catalog of products.   ### Operations Product Catalog API performs the following operations on the resources : - Retrieve an entity or a collection of entities depending on filter criteria - Partial update of an entity (including updating rules) - Create an entity (including default values and creation rules) - Delete an entity - Manage notification of events
 *
 * The version of the OpenAPI document: 4.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ProductOfferingPriceDeleteEventPayload;
import org.threeten.bp.OffsetDateTime;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class ProductOfferingPriceDeleteEvent {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private ProductOfferingPriceDeleteEventPayload event;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_TIME_OCURRED = "timeOcurred";
  @SerializedName(SERIALIZED_NAME_TIME_OCURRED)
  private OffsetDateTime timeOcurred;


  public ProductOfferingPriceDeleteEvent event(ProductOfferingPriceDeleteEventPayload event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductOfferingPriceDeleteEventPayload getEvent() {
    return event;
  }


  public void setEvent(ProductOfferingPriceDeleteEventPayload event) {
    this.event = event;
  }


  public ProductOfferingPriceDeleteEvent eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the notification.")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ProductOfferingPriceDeleteEvent eventTime(OffsetDateTime eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of the event occurrence.")

  public OffsetDateTime getEventTime() {
    return eventTime;
  }


  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public ProductOfferingPriceDeleteEvent eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the notification.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public ProductOfferingPriceDeleteEvent correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The correlation id for this event.")

  public String getCorrelationId() {
    return correlationId;
  }


  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public ProductOfferingPriceDeleteEvent domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain of the event.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public ProductOfferingPriceDeleteEvent title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the event.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProductOfferingPriceDeleteEvent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An explnatory of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An explnatory of the event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductOfferingPriceDeleteEvent priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A priority.")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public ProductOfferingPriceDeleteEvent timeOcurred(OffsetDateTime timeOcurred) {
    
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the event occured.")

  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }


  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceDeleteEvent productOfferingPriceDeleteEvent = (ProductOfferingPriceDeleteEvent) o;
    return Objects.equals(this.event, productOfferingPriceDeleteEvent.event) &&
        Objects.equals(this.eventId, productOfferingPriceDeleteEvent.eventId) &&
        Objects.equals(this.eventTime, productOfferingPriceDeleteEvent.eventTime) &&
        Objects.equals(this.eventType, productOfferingPriceDeleteEvent.eventType) &&
        Objects.equals(this.correlationId, productOfferingPriceDeleteEvent.correlationId) &&
        Objects.equals(this.domain, productOfferingPriceDeleteEvent.domain) &&
        Objects.equals(this.title, productOfferingPriceDeleteEvent.title) &&
        Objects.equals(this.description, productOfferingPriceDeleteEvent.description) &&
        Objects.equals(this.priority, productOfferingPriceDeleteEvent.priority) &&
        Objects.equals(this.timeOcurred, productOfferingPriceDeleteEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceDeleteEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

