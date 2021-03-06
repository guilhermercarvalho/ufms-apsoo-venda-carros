package br.ufms.apsoo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufms.apsoo.model.Gerente;

public class GerenteDao {
  private EntityManager em;

  public GerenteDao(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Gerente cliente) {
    this.em.persist(cliente);
  }

  public void atualizar(Gerente cliente) {
    this.em.merge(cliente);
  }

  public void remover(Gerente cliente) {
    cliente = em.merge(cliente);
    this.em.remove(cliente);
  }

  public Gerente buscarPorCpf(String cpf) {
    return em.find(Gerente.class, cpf);
  }

  public List<Gerente> buscarPorTodos() {
    String jpql = "SELECT g FROM Gerente g";
    return em.createQuery(jpql, Gerente.class).getResultList();
  }

}