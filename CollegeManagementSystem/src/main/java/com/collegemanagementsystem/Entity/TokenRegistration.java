package com.collegemanagementsystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Token")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TokenRegistration {
    @Id
   private String token;
    private int uid;

}
