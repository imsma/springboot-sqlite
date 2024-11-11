package im.sma.bysma.springbootsqlite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import im.sma.bysma.springbootsqlite.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
