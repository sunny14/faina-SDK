package faina.sdk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepo extends JpaRepository<faina.sdk.entity.Character, Long> {
}
