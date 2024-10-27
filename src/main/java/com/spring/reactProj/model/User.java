package com.spring.reactProj.model;

import com.nimbusds.oauth2.sdk.Role;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@Table(name = "tbluser")
public class User {
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;
  private String password;
  private String email;

  @Enumerated(EnumType.STRING)
  private Role role;  // ADMIN, MANAGER, USER

  private String provider;   // 어떤 AUTH 인지 (NAVER, GOOGLE, KAKAO ... )
  private String provideid;   // 해당 AUTH의 KEY ID

  private LocalDateTime createdt;

  @Builder
  public User(Long id, String username, String password, String email, Role role, String provider, String provideId, LocalDateTime createDt) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.role = role;
    this.provider = provider;
    this.provideid = provideId;
    this.createdt = createDt;
  }
}