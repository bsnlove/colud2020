package com.trall.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{

    @Id
    private Integer id;

    @Column
    private String serial;
}
