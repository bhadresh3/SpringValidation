package com.system27.beanValidators.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.system27.beanValidators.Validators.Gender.Gender;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "please provide name")
    @Size(max = 100)
    private String name;

    @NotNull(message = "please provide age")
    @Min(value = 0, message = "age can not be less than 0 or grea")
    @Max(100)
    private int age;

    @Gender(message = "'${validatedValue}' is not allowed")
    @NotNull(message = "Please provide gender")
    private String gender;

    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z]+).([a-zA-Z]{2,5})$")
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @Pattern(regexp = "^\\d{10}")
    private String phoneNo;

}
