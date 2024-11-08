package ucu.edu.ua.appps.flower_lab8.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Table
@Entity(name = "app_user")
@Data
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
    public static void main(String[] args) {
        
    }
}
