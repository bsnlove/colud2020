package com.trall.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private long id;

    private String serial;
}
