package br.com.ruandavid.estacionamentofcamara.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Veiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty(message = "A marca é obrigatória")
  private String marca;

  @NotEmpty(message = "O modelo é obrigatório")
  private String modelo;

  @NotEmpty(message = "A cor é obrigatória")
  private String cor;

  @NotEmpty(message = "A placa é obrigatória")
  private String placa;

  @NotEmpty(message = "O tipo é obrigatório")
  private String tipo;
}
