package com.Telebeler2.Telebeler2.MODEL.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTelebeRequest {
    private String name;
    private String surname;
    private Integer age;
}
