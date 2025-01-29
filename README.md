# JPARepository Query Methods - Study

This project it's to test the functionalities of `JpaRepository` in Java using `Query Methods` from Spring Data JPA.

## Description

An interface was created for an in-depth study of the JPA interface, comparing the old search using JPQL (a variation of SQL adapted for JPA) with `Query Methods`.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Relational database (H2, PostgreSQL, or MySQL)

## Example of Repository Interface

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MyRepository extends JpaRepository<Entity, Long> {
    List<Entity> findByName(String name);
    List<Entity> findByIdGreaterThan(Long id);
    List<Entity> findByCreationDateBetween(Date start, Date end);
}
```

---

##How to Run

1. Clone this repository 
2. Configure the database in application.properties
3. Run the application with Spring Boot

Reference

[Spring Data JPA Query Methods](https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods)
