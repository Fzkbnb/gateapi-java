/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.6.1
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gate.gateapi.models.PositionCloseOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Position
 */

public class Position {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Long user;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private String leverage;

  public static final String SERIALIZED_NAME_RISK_LIMIT = "risk_limit";
  @SerializedName(SERIALIZED_NAME_RISK_LIMIT)
  private String riskLimit;

  public static final String SERIALIZED_NAME_LEVERAGE_MAX = "leverage_max";
  @SerializedName(SERIALIZED_NAME_LEVERAGE_MAX)
  private String leverageMax;

  public static final String SERIALIZED_NAME_MAINTENANCE_RATE = "maintenance_rate";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_RATE)
  private String maintenanceRate;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private String margin;

  public static final String SERIALIZED_NAME_ENTRY_PRICE = "entry_price";
  @SerializedName(SERIALIZED_NAME_ENTRY_PRICE)
  private String entryPrice;

  public static final String SERIALIZED_NAME_LIQ_PRICE = "liq_price";
  @SerializedName(SERIALIZED_NAME_LIQ_PRICE)
  private String liqPrice;

  public static final String SERIALIZED_NAME_MARK_PRICE = "mark_price";
  @SerializedName(SERIALIZED_NAME_MARK_PRICE)
  private String markPrice;

  public static final String SERIALIZED_NAME_UNREALISED_PNL = "unrealised_pnl";
  @SerializedName(SERIALIZED_NAME_UNREALISED_PNL)
  private String unrealisedPnl;

  public static final String SERIALIZED_NAME_REALISED_PNL = "realised_pnl";
  @SerializedName(SERIALIZED_NAME_REALISED_PNL)
  private String realisedPnl;

  public static final String SERIALIZED_NAME_HISTORY_PNL = "history_pnl";
  @SerializedName(SERIALIZED_NAME_HISTORY_PNL)
  private String historyPnl;

  public static final String SERIALIZED_NAME_LAST_CLOSE_PNL = "last_close_pnl";
  @SerializedName(SERIALIZED_NAME_LAST_CLOSE_PNL)
  private String lastClosePnl;

  public static final String SERIALIZED_NAME_ADL_RANKING = "adl_ranking";
  @SerializedName(SERIALIZED_NAME_ADL_RANKING)
  private Integer adlRanking;

  public static final String SERIALIZED_NAME_PENDING_ORDERS = "pending_orders";
  @SerializedName(SERIALIZED_NAME_PENDING_ORDERS)
  private Integer pendingOrders;

  public static final String SERIALIZED_NAME_CLOSE_ORDER = "close_order";
  @SerializedName(SERIALIZED_NAME_CLOSE_ORDER)
  private PositionCloseOrder closeOrder = null;

   /**
   * User ID
   * @return user
  **/
  @ApiModelProperty(value = "User ID")
  public Long getUser() {
    return user;
  }

   /**
   * Futures contract
   * @return contract
  **/
  @ApiModelProperty(value = "Futures contract")
  public String getContract() {
    return contract;
  }

   /**
   * Position size
   * @return size
  **/
  @ApiModelProperty(value = "Position size")
  public Long getSize() {
    return size;
  }

  public Position leverage(String leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Position leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "Position leverage")
  public String getLeverage() {
    return leverage;
  }

  public void setLeverage(String leverage) {
    this.leverage = leverage;
  }

  public Position riskLimit(String riskLimit) {
    this.riskLimit = riskLimit;
    return this;
  }

   /**
   * Position risk limit
   * @return riskLimit
  **/
  @ApiModelProperty(value = "Position risk limit")
  public String getRiskLimit() {
    return riskLimit;
  }

  public void setRiskLimit(String riskLimit) {
    this.riskLimit = riskLimit;
  }

   /**
   * Maximum leverage under current risk limit
   * @return leverageMax
  **/
  @ApiModelProperty(value = "Maximum leverage under current risk limit")
  public String getLeverageMax() {
    return leverageMax;
  }

   /**
   * Maintenance rate under current risk limit
   * @return maintenanceRate
  **/
  @ApiModelProperty(value = "Maintenance rate under current risk limit")
  public String getMaintenanceRate() {
    return maintenanceRate;
  }

   /**
   * Position value calculated in settlement currency
   * @return value
  **/
  @ApiModelProperty(value = "Position value calculated in settlement currency")
  public String getValue() {
    return value;
  }

  public Position margin(String margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Position margin
   * @return margin
  **/
  @ApiModelProperty(value = "Position margin")
  public String getMargin() {
    return margin;
  }

  public void setMargin(String margin) {
    this.margin = margin;
  }

   /**
   * Entry price
   * @return entryPrice
  **/
  @ApiModelProperty(value = "Entry price")
  public String getEntryPrice() {
    return entryPrice;
  }

   /**
   * Liquidation price
   * @return liqPrice
  **/
  @ApiModelProperty(value = "Liquidation price")
  public String getLiqPrice() {
    return liqPrice;
  }

   /**
   * Current mark price
   * @return markPrice
  **/
  @ApiModelProperty(value = "Current mark price")
  public String getMarkPrice() {
    return markPrice;
  }

   /**
   * Unrealized PNL
   * @return unrealisedPnl
  **/
  @ApiModelProperty(value = "Unrealized PNL")
  public String getUnrealisedPnl() {
    return unrealisedPnl;
  }

   /**
   * Realized PNL
   * @return realisedPnl
  **/
  @ApiModelProperty(value = "Realized PNL")
  public String getRealisedPnl() {
    return realisedPnl;
  }

   /**
   * History realized PNL
   * @return historyPnl
  **/
  @ApiModelProperty(value = "History realized PNL")
  public String getHistoryPnl() {
    return historyPnl;
  }

   /**
   * PNL of last position close
   * @return lastClosePnl
  **/
  @ApiModelProperty(value = "PNL of last position close")
  public String getLastClosePnl() {
    return lastClosePnl;
  }

   /**
   * ADL ranking, range from 1 to 5
   * @return adlRanking
  **/
  @ApiModelProperty(value = "ADL ranking, range from 1 to 5")
  public Integer getAdlRanking() {
    return adlRanking;
  }

   /**
   * Current open orders
   * @return pendingOrders
  **/
  @ApiModelProperty(value = "Current open orders")
  public Integer getPendingOrders() {
    return pendingOrders;
  }

  public Position closeOrder(PositionCloseOrder closeOrder) {
    this.closeOrder = closeOrder;
    return this;
  }

   /**
   * Get closeOrder
   * @return closeOrder
  **/
  @ApiModelProperty(value = "")
  public PositionCloseOrder getCloseOrder() {
    return closeOrder;
  }

  public void setCloseOrder(PositionCloseOrder closeOrder) {
    this.closeOrder = closeOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.user, position.user) &&
        Objects.equals(this.contract, position.contract) &&
        Objects.equals(this.size, position.size) &&
        Objects.equals(this.leverage, position.leverage) &&
        Objects.equals(this.riskLimit, position.riskLimit) &&
        Objects.equals(this.leverageMax, position.leverageMax) &&
        Objects.equals(this.maintenanceRate, position.maintenanceRate) &&
        Objects.equals(this.value, position.value) &&
        Objects.equals(this.margin, position.margin) &&
        Objects.equals(this.entryPrice, position.entryPrice) &&
        Objects.equals(this.liqPrice, position.liqPrice) &&
        Objects.equals(this.markPrice, position.markPrice) &&
        Objects.equals(this.unrealisedPnl, position.unrealisedPnl) &&
        Objects.equals(this.realisedPnl, position.realisedPnl) &&
        Objects.equals(this.historyPnl, position.historyPnl) &&
        Objects.equals(this.lastClosePnl, position.lastClosePnl) &&
        Objects.equals(this.adlRanking, position.adlRanking) &&
        Objects.equals(this.pendingOrders, position.pendingOrders) &&
        Objects.equals(this.closeOrder, position.closeOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, contract, size, leverage, riskLimit, leverageMax, maintenanceRate, value, margin, entryPrice, liqPrice, markPrice, unrealisedPnl, realisedPnl, historyPnl, lastClosePnl, adlRanking, pendingOrders, closeOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    riskLimit: ").append(toIndentedString(riskLimit)).append("\n");
    sb.append("    leverageMax: ").append(toIndentedString(leverageMax)).append("\n");
    sb.append("    maintenanceRate: ").append(toIndentedString(maintenanceRate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
    sb.append("    liqPrice: ").append(toIndentedString(liqPrice)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    historyPnl: ").append(toIndentedString(historyPnl)).append("\n");
    sb.append("    lastClosePnl: ").append(toIndentedString(lastClosePnl)).append("\n");
    sb.append("    adlRanking: ").append(toIndentedString(adlRanking)).append("\n");
    sb.append("    pendingOrders: ").append(toIndentedString(pendingOrders)).append("\n");
    sb.append("    closeOrder: ").append(toIndentedString(closeOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

