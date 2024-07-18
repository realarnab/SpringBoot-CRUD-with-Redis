package com.api.redis.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable { //object will be stored in the database in serializable form

    private String userId;
    private String name;
    private String phone;
    private String email;
}
