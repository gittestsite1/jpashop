package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter @Getter
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

}
