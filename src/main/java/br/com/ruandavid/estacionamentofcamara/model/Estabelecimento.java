package br.com.ruandavid.estacionamentofcamara.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
public class Estabelecimento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty(message = "O nome do estabelecimento é obrigatório")
  private String nome;

  @NotEmpty(message = "O CNPJ do estabelecimento é obrigatório")
  @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}", message = "O CNPJ deve estar no formato XX.XXX.XXX/XXXX-XX")
  private String cnpj;

  @NotEmpty(message = "O endereço do estabelecimento é obrigatório")
  private String endereco;

  @NotEmpty(message = "O telefone do estabelecimento é obrigatório")
  @Pattern(regexp = "\\+(\\d{2}\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve estar no formato (XX) XXXXX-XXXX ou (XX) XXXX-XXXX")
  private String telefone;

  @NotEmpty(message = "A quantidade de vagas para motos é obrigatória")
  private int vagasMotos;

  @NotEmpty(message = "A quantidade de vagas para carros é obrigatória")
  private int vagasCarros;
}
