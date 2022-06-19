package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Entity 어노테이션은 JPA에서 DB의 테이블을 의미한다 */
/* Data 어노테이션은 Lombok에서 제공한다 */
@Entity
@Data
public class Board {
    /* 컬럼정의 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
}
