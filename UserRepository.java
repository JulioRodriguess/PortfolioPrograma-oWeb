package br.com.portfolioJulio.Julio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolioJulio.Julio.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
