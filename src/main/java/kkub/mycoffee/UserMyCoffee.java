package kkub.mycoffee;

import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString



@Entity
public class UserMyCoffee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@NotBlank(message="Wypełnij pole")
private String name;
@NotBlank(message="Wypełnij pole")
private String lastName;
@Email
@NotBlank(message="Proszę wpisać właściwy email")
private String email;
@NotEmpty(message="Proszę wpisać hasło")
private String password;


}
