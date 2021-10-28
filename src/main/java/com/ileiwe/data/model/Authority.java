package com.ileiwe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Authority {
    @Id
    @GeneratedValue
    private UUID id; //UUID generates random string of unique value and is more secure
    @Enumerated(EnumType.STRING)
    private Role authority;
}
