package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class MyObject implements Serializable {
    private static final long serialVersionUID = 689045989298984080L;

    @Id
    private String id;
    private String key;
    private String name;
}
