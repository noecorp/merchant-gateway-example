package ru.allrecipes.merchant.domain;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Invoice extends DomainId {

  enum State {
    NEW, PAID, LOCKED
  }

  @ManyToOne
  private Supplier supplier;
  
  @ManyToOne
  private Customer customer;

  private String caption;

  private String description;

  private Double amount;

  private OffsetDateTime createdDate;

  private OffsetDateTime paidDate;

}