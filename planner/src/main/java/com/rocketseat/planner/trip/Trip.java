package com.rocketseat.planner.trip;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity //indca para o sping a pro jpa que essa classe é uma entidade
@Table(name = "trips")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //indica que foi gerada automanticamente
    private UUID id;

    @Column(nullable = false)
    private String destination;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "ends_at", nullable = false)
    private LocalDateTime endsAt;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(name = "owner_name", nullable = false)
    private String ownerName;

    @Column(name = "owner_email", nullable = false)
    private String ownerEmail;

    public Trip(TripRequestPayload data){
        this.destination = data.destination();
        this.isConfirmed = false;
        this.ownerEmail = data.owner_email();
        this.ownerName = data.owner_name();
        this.startsAt = LocalDateTime.parse(data.starts_at(), DateTimeFormatter.ISO_DATE_TIME); //transformação pro tipo local date time
        this.endsAt = LocalDateTime.parse(data.ends_at(), DateTimeFormatter.ISO_DATE_TIME);
    }
}
