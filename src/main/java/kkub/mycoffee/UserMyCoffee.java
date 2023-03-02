package kkub.mycoffee;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

@Table(name = "UserMyCoffe")

@Entity
public class UserMyCoffee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;
//@NotBlank(message="Set Name")
private String name;
//@NotBlank(message="Set LastName")
private String lastName;
//@Email
private String email;
//@NotEmpty
private String password;


    
    
}
