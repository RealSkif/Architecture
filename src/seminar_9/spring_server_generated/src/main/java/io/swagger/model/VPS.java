package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-08T15:31:50.629007628Z[GMT]")


public class VPS   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("server_id")
  private Long serverId = null;

  @JsonProperty("ram")
  private Long ram = null;

  @JsonProperty("cpu")
  private Integer cpu = null;

  @JsonProperty("storage")
  private Integer storage = null;

  @JsonProperty("os")
  private String os = null;

  @JsonProperty("ip")
  private String ip = null;

  public VPS id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VPS serverId(Long serverId) {
    this.serverId = serverId;
    return this;
  }

  /**
   * Get serverId
   * @return serverId
   **/
  @Schema(example = "10", description = "")
  
    public Long getServerId() {
    return serverId;
  }

  public void setServerId(Long serverId) {
    this.serverId = serverId;
  }

  public VPS ram(Long ram) {
    this.ram = ram;
    return this;
  }

  /**
   * Get ram
   * @return ram
   **/
  @Schema(example = "32", required = true, description = "")
      @NotNull

    public Long getRam() {
    return ram;
  }

  public void setRam(Long ram) {
    this.ram = ram;
  }

  public VPS cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Get cpu
   * @return cpu
   **/
  @Schema(example = "16", description = "")
  
    public Integer getCpu() {
    return cpu;
  }

  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  public VPS storage(Integer storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Get storage
   * @return storage
   **/
  @Schema(example = "1024", description = "")
  
    public Integer getStorage() {
    return storage;
  }

  public void setStorage(Integer storage) {
    this.storage = storage;
  }

  public VPS os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   **/
  @Schema(example = "Windows 11", description = "")
  
    public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public VPS ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   **/
  @Schema(example = "192.168.0.0", description = "")
  
    public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPS VPS = (VPS) o;
    return Objects.equals(this.id, VPS.id) &&
        Objects.equals(this.serverId, VPS.serverId) &&
        Objects.equals(this.ram, VPS.ram) &&
        Objects.equals(this.cpu, VPS.cpu) &&
        Objects.equals(this.storage, VPS.storage) &&
        Objects.equals(this.os, VPS.os) &&
        Objects.equals(this.ip, VPS.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serverId, ram, cpu, storage, os, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPS {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
