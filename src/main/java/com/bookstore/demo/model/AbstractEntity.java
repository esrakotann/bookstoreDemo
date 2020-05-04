package com.bookstore.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long ID;

    private LocalDateTime createDate = LocalDateTime.now();

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

}
