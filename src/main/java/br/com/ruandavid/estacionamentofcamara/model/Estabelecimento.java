package br.com.ruandavid.estacionamentofcamara.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
public class Estabelecimento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty(message = "O nome do estabelecimento é obrigatório!")
  private String nome;

  @NotEmpty(message = "O CNPJ do estabelecimento é obrigatório!")
  @CNPJ(message = "Formato de CNPJ inválido!")
  private String cnpj;

  @NotEmpty(message = "O endereço do estabelecimento é obrigatório!")
  private String endereco;

  @NotEmpty(message = "O telefone do estabelecimento é obrigatório!")
  @Pattern(
    regexp = "\\d{13}\\|\\d{12}",
    message = "O telefone deve ter entre 12 e 13 digitos"
  )
  private String telefone;

  @NotEmpty(message = "A quantidade de vagas para motos é obrigatória!")
  private int vagasMotos;

  @NotEmpty(message = "A quantidade de vagas para carros é obrigatória!")
  private int vagasCarros;
}
