package com.maids.devprices.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Getter @Setter
@Builder @Accessors(chain = true)
@NoArgsConstructor @AllArgsConstructor
public class Device {
    Integer id;
    Integer batteryPower;
    Boolean hasBluetooth;
    Double clockSpeed;
    Boolean hasDualSIM;
    Integer frontCameraMb;
    Boolean hasFourG;
    Double internalMemorySize;
    Double depth;
    Integer weight;
    Integer numOfCores;
    Integer primaryCameraMb;
    Double pixelResolutionHeight;
    Double pixelResolutionWidth;
    Integer ramSize;
    Integer screenHeight;
    Integer screenWidth;
    Integer talkTime;
    Boolean hasThreeG;
    Boolean hasTouchScreen;
    Boolean hasWifi;
}
