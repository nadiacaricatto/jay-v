package com.jayv.backend.model;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @NotBlank(message="Todo personagem tem um nome. Qual vai ser o seu?")
    private String userName; 
    
    @NotBlank(message="Precisamos do seu e-mail para criar sua conta.")
    @Email(message="Esse e-mail não parece válido. Confere o que você digitou e tenta de novo.")
    private String email; 

    @NotBlank(message="Crie uma senha de acesso para sua conta.")
    @Size(min = 8, message="A Senha precisa ter pelo menos 8 caracteres.")
    private String password; 

    @NotNull(message="Escolha como o Jay V deve se referir a você.")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull(message="Informe sua data de nascimento para continuar.")
    private LocalDate dateOfBirth; 

    @NotBlank(message="Escolha um avatar para exibir no seu perfil!")
    private String avatarId; 

    @OneToOne (fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private StudentProfile studentProfile;


public Long getId () {
    return this.id;    
}

public void setId (Long id) {
    this.id = id;     
}

public String getUserName () {
    return this.userName;    
}

public void setUserName (String userName) {
    this.userName = userName;     
}

public String getEmail () {
    return this.email;    
}

public void setEmail (String email) {
    this.email = email;  
}

public String getPassword () {
    return this.password;    
}

public void setPassword (String password) {
    this.password = password;  
}

public Gender getGender() {
    return this.gender;
}

public void setGender(Gender gender) {
    this.gender = gender;
}

public LocalDate getDateOfBirth() {
    return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public String getAvatarId() {
    return avatarId;
}

public void setAvatarId (String avatarId) {
    this.avatarId = avatarId;
}

public StudentProfile getStudentProfile () {
    return this.studentProfile;    
}

public void setStudentProfile (StudentProfile studentProfile) {
    this.studentProfile = studentProfile;  
}

}


