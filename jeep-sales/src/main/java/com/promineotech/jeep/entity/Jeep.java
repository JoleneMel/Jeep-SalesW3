package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  private Long modelPK;
  private JeepModel modelId;
  private String trimLevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;
  
  //Overriding lombok
  //It will leave out the modelPK but will still set because we have not applied this to the setter 
  @JsonIgnore
  public Long getModelPK() {
    return modelPK;
  }
}

