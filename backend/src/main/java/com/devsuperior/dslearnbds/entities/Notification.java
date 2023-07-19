package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "tb_notification")
public class Notification {
    @EqualsAndHashCode.Include
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(columnDefinition = "text")
    private String text;

    @Setter(AccessLevel.NONE)
    @Column(columnDefinition = "timestamp with time zone")
    private Instant moment;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean read;

    @NonNull
    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    private void prePersist() {
        moment = Instant.now();
    }
}
