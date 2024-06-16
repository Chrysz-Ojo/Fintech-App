package com.chrysz.javaacademybank.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the user", example = "1")
    private Long id;

    @Schema(description = "User's first name", example = "John")
    private String firstName;

    @Schema(description = "User's last name", example = "Doe")
    private String lastName;

    @Schema(description = "User's other names", example = "Middle")
    private String otherName;

    @Schema(description = "User's gender", example = "Male")
    private String gender;

    @Schema(description = "User's residential address", example = "123 Main St, Springfield")
    private String address;

    @Schema(description = "User's state of origin", example = "California")
    private String stateOfOrigin;

    @Schema(description = "User's account number", example = "123456789")
    private String accountNumber;

    @Schema(description = "User's account balance", example = "1000.00")
    private BigDecimal accountBalance;

    @Schema(description = "User's email address", example = "john.doe@example.com")
    private String email;

    @Schema(description = "User's password", example = "password123")
    private String password;

    @Schema(description = "User's phone number", example = "+1234567890")
    private String phoneNumber;

    @Schema(description = "User's alternative phone number", example = "+0987654321")
    private String alternativePhoneNumber;

    @Schema(description = "User's status", example = "ACTIVE")
    private String status;

    @Schema(description = "User's role", example = "USER")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Schema(description = "Timestamp when the user was created")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Schema(description = "Timestamp when the user was last modified")
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
