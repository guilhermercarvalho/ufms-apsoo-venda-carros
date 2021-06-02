package br.ufms.apsoo.model;

import java.time.LocalDate;
import java.util.Objects;

import org.hibernate.annotations.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "clientes")
public class Cliente extends Pessoa {

  @Column(name = "codigoId", columnDefinition = "serial")
  @Generated(GenerationTime.INSERT)
  private Integer codigo;
  private double renda;

  @Column(name = "criado_em")
  private LocalDate criadoEm = LocalDate.now();

  @Column(name = "atualizado_em")
  private LocalDate atualizadoEm = null;

  public Cliente() {
  }

  public Cliente(String cpf, String rg, String nome, String email, LocalDate dataNascimento, String telResidencial,
  String telCelular, Endereco endereco, double renda) {
    super(cpf, rg, nome, email, dataNascimento, telResidencial, telCelular, endereco);
    this.renda = renda;
  }

  public Integer getCodigo() {
    return this.codigo;
  }

  public double getRenda() {
    return this.renda;
  }

  public void setRenda(double renda) {
    this.renda = renda;
    setAtualizadoEm(LocalDate.now());
  }

  public LocalDate getCriadoEm() {
    return this.criadoEm;
  }

  public LocalDate getAtualizadoEm() {
    return this.atualizadoEm;
  }

  public void setAtualizadoEm(LocalDate atualizadoEm) {
    this.atualizadoEm = atualizadoEm;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Cliente)) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(codigo, cliente.codigo) && renda == cliente.renda
        && Objects.equals(criadoEm, cliente.criadoEm) && Objects.equals(atualizadoEm, cliente.atualizadoEm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, renda, criadoEm, atualizadoEm);
  }

  @Override
  public String toString() {
    return "{" + " codigo='" + getCodigo() + "'" + ", renda='" + getRenda() + "'" + ", criadoEm='" + getCriadoEm() + "'"
        + ", atualizadoEm='" + getAtualizadoEm() + "'" + "}";
  }

}