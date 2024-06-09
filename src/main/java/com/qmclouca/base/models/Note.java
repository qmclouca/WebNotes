package com.qmclouca.base.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Note extends BaseEntity {
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Long clientId;

    public Object getNoteTitle() {
        return title;
    }

    public Object getNoteContent() {
        return content;
    }
}
