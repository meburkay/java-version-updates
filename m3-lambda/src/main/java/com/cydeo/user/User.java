package com.cydeo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastname;
    private int age;

}
