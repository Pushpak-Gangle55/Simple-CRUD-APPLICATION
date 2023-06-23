package com.Save.API.SimpleAPI.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@Table(name = "NewStudent")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

        @Id
        @Column(name="Id")
        @GeneratedValue
        private int id;


        @Column(name = "Name")
        private String name;


        @Column(name="marks")
        private int mark;








}
