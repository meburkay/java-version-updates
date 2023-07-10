package com.cydeo.review;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@RequiredArgsConstructor
@Data
public class Student extends Person {

    private String name;
    private int id;

}
