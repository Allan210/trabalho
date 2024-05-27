package br.com.fiap.Trafegos45.repository;

import br.com.fiap.Trafegos45.model.Trafego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafegoRepository extends JpaRepository<Trafego, Long> {
}
