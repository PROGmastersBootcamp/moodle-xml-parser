package com.progmasters.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    private byte[] data;
    private String mediaType;
    private String originalFileName;

}
