package ru.sbrf.springhiber.springhiber.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sbrf.springhiber.springhiber.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}